package com.lichee.infinite.magic.service;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;
import com.lichee.infinite.magicplugin.utils.MagicPluginBundle;
import okhttp3.*;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

/**
 * 项目级 AI 助手服务，处理 AI API 调用
 * 改进版：添加了实际的HTTP请求实现和更完善的错误处理
 */
@Service(Service.Level.PROJECT)
public final class AIAssistantService {

    private final Project project;
    private final OkHttpClient httpClient;

    // 使用连接池和超时设置的HTTP客户端
    public AIAssistantService(@NotNull Project project) {
        this.project = project;
        this.httpClient = new OkHttpClient.Builder()
                .connectTimeout(300, TimeUnit.SECONDS)
                .writeTimeout(300, TimeUnit.SECONDS)
                .readTimeout(300, TimeUnit.SECONDS)
                .build();
    }

    public static AIAssistantService getInstance(@NotNull Project project) {
        return project.getService(AIAssistantService.class);
    }

    /**
     * 调用 AI API - 改进版：使用实际的HTTP请求
     */
    public String callApi(String userPrompt) throws IOException {
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

        RequestBody body = RequestBody.create(
                requestBody.toString(),
                MediaType.parse("application/json; charset=utf-8")
        );

        Request request = new Request.Builder()
                .url(apiUrl)
                .post(body)
                .addHeader("Authorization", "Bearer " + apiToken)
                .addHeader("Content-Type", "application/json")
                .build();

        // 4. 执行请求
        try (Response response = httpClient.newCall(request).execute()) {
            if (!response.isSuccessful()) {
                throw new IOException("Unexpected code " + response + ": " + response.body().string());
            }

            // 5. 解析响应
            String responseBody = response.body().string();
            JSONObject jsonResponse = new JSONObject(responseBody);
            // 根据实际的API响应结构进行调整
            if (jsonResponse.has("choices") && jsonResponse.getJSONArray("choices").length() > 0) {
                JSONArray choices = jsonResponse.getJSONArray("choices");
                JSONObject firstChoice = choices.getJSONObject(0);
                JSONObject message = firstChoice.getJSONObject("message");
                return message.getString("content");
            } else if (jsonResponse.has("message")) {
                return jsonResponse.getString("message");
            } else {
                return MagicPluginBundle.message("ui.api.response.unparseable") + responseBody;
            }
        } catch (Exception e) {
            throw new IOException(MagicPluginBundle.message("ui.api.call.failure") + e.getMessage(), e);
        }
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
        requestBody.put("stream", false);
        return requestBody;
    }
}