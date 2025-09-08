package com.lichee.infinite.magic.service;

import com.google.gson.Gson;
import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;
import com.lichee.infinite.magic.model.DeepSeekRepo;
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle;
import kotlinx.html.S;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Flux;
import reactor.core.scheduler.Schedulers;

import java.io.IOException;
import java.time.Duration;

/**
 * 项目级 AI 助手服务，处理 AI API 调用
 * 改进版：添加了实际的HTTP请求实现和更完善的错误处理
 */
@Service(Service.Level.PROJECT)
public final class AIAssistantService {

    private final Project project;
    private final WebClient webClient;

    // 使用连接池和超时设置的HTTP客户端
    public AIAssistantService(@NotNull Project project) {
        this.project = project;
        // 从 WebClientManager 获取 WebClient 实例
        this.webClient = WebClientManager.getInstance().getWebClient();
    }

    public static AIAssistantService getInstance(@NotNull Project project) {
        return project.getService(AIAssistantService.class);
    }

    /**
     * 使用 WebClient 和 SSE 调用 AI API
     */
    public Flux<String> callApiStreaming(String userPrompt) {
        // 1. 获取设置
        AppSettingsService settingsService = AppSettingsService.getInstance();
        String apiUrl = settingsService.getApiUrl();
        String apiToken = settingsService.getApiToken();
        String modelName = settingsService.getModelName(); // 获取配置的模型名称
        String systemPrompt = settingsService.getSystemPrompt();
        // 2. 检查设置是否完整
        if (apiUrl == null || apiUrl.isBlank() || apiToken == null || apiToken.isBlank() || modelName == null || modelName.isBlank()) {
            throw new IllegalStateException(MagicPluginBundle.message("ui.api.config.complete"));
        }

        // 3. 构建符合 OpenAI API 格式的请求 JSON
        JSONObject requestBody = getRequestBody(userPrompt, modelName, systemPrompt);

        return webClient.post()
                .uri(apiUrl)
                .header("Authorization", "Bearer " + apiToken)
                .header("Content-Type", "application/json")
                .bodyValue(requestBody.toString())
                .accept(MediaType.TEXT_EVENT_STREAM)
                .retrieve()
                .bodyToFlux(String.class)
                .timeout(Duration.ofSeconds(300)) // 设置超时时间;
                .onErrorResume(e -> Flux.error(new IOException(MagicPluginBundle.message("ui.api.call.failure") + e.getMessage(), e)))
                .publishOn(Schedulers.boundedElastic()) // 在后台线程处理
                .filter(data -> !data.equals("[DONE]") && !data.trim().isEmpty()) // 过滤结束信号和空数据
                .map(sseData -> extractContentFromSSE(sseData, modelName)) // 提取内容
                .filter(content -> content != null && !content.isEmpty()); // 过滤空内容
    }

    private static @NotNull JSONObject getRequestBody(String userPrompt, String modelName, String systemPrompt) {
        JSONObject requestBody = new JSONObject();
        requestBody.put("model", modelName); // 使用配置的模型名称，而不是硬编码的
        // 构建 messages 数组
        JSONArray messagesArray = new JSONArray();
        JSONObject userMessage = new JSONObject();
        if (systemPrompt != null && !systemPrompt.isEmpty()) {
            JSONObject systemMessage = new JSONObject();
            systemMessage.put("role", "system");
            systemMessage.put("content", systemPrompt);
            messagesArray.put(systemMessage);
        }
        userMessage.put("role", "user");
        userMessage.put("content", userPrompt);
        messagesArray.put(userMessage);
        requestBody.put("messages", messagesArray); // 确保 messages 字段存在且是数组
        // 添加其他可选参数
        requestBody.put("temperature", 0.7);
        requestBody.put("max_tokens", 2000);
        requestBody.put("stream", true);
        return requestBody;
    }

    private String extractContentFromSSE(String sseData, String modelName) {
        System.out.println("Raw SSE Data: " + sseData); // 添加日志记录原始数据
        try {
            if (sseData!=null && !sseData.isEmpty()) {
                DeepSeekRepo deepSeekRepo = new Gson().fromJson(sseData, DeepSeekRepo.class);
                if (deepSeekRepo != null && deepSeekRepo.getChoices() != null && !deepSeekRepo.getChoices().isEmpty()) {
                    String reasoningContent = deepSeekRepo.getChoices().get(0).getDelta().getReasoning_content();
                    String content = deepSeekRepo.getChoices().get(0).getDelta().getContent();
                    if (modelName.equalsIgnoreCase("deepseek-reasoner") && reasoningContent != null) {
                        return reasoningContent;
                    }
                    if (content == null) {
                        return "";
                    }
                    return content;
                }
            } else if (sseData.trim().isEmpty()) {
                // 忽略空行或心跳包
                System.out.println("Received empty line or heartbeat");
                return "";
            }
        } catch (Exception e) {
            System.err.println("Error parsing SSE data: " + sseData + ", error: " + e.getMessage());
        }
        return "";
    }
}