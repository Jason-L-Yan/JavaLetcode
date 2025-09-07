package com.lichee.infinite.magic.service;

import com.intellij.openapi.components.Service;
import com.intellij.openapi.project.Project;
import org.jetbrains.annotations.NotNull;

/**
 * 项目级 AI 助手服务，处理 AI  API 调用。
 * 使用轻量级 Service 注解。
 */
@Service(Service.Level.PROJECT) // 指定为项目级服务
public final class AIAssistantService {

    private final Project project;

    // Project 会被 IntelliJ 平台自动注入
    public AIAssistantService(@NotNull Project project) {
        this.project = project;
    }

    /**
     * 获取当前项目的此服务实例。
     */
    public static AIAssistantService getInstance(@NotNull Project project) {
        return project.getService(AIAssistantService.class);
    }

    /**
     * 调用 AI  API。
     *
     * @param prompt 用户输入的提示词
     * @return AI 的回答内容，或错误信息
     */
    public String callApi(String prompt) {
        // 1. 获取设置
        AppSettingsService settingsService = AppSettingsService.getInstance();
        String apiUrl = settingsService.getApiUrl();
        String apiToken = settingsService.getApiToken();

        // 2. 检查设置是否完整
        if (apiUrl == null || apiUrl.isBlank() || apiToken == null || apiToken.isBlank()) {
            return "错误：请先在设置中配置 API  URL 和 Token。";
        }

        // 3. 实际调用 API (此处为模拟实现)
        try {
            // 模拟网络延迟
            Thread.sleep(1000);
            // 这里是实际调用 HTTP 客户端 (如 OkHttp) 的地方
            // String responseBody = makeHttpRequest(apiUrl, apiToken, prompt);
            // return parseResponse(responseBody);

            return String.format("模拟对提示词 '%s' 的回复。\nAPI: %s\nToken: %s",
                    prompt, apiUrl, apiToken.substring(0, Math.min(5, apiToken.length())) + "***");
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return "API 调用被中断: " + e.getMessage();
        } catch (Exception e) {
            return "API 调用发生错误: " + e.getMessage();
        }
    }

    // 实际项目中，你会在这里实现 HTTP 请求逻辑
    // private String makeHttpRequest(String url, String token, String prompt) { ... }
    // private String parseResponse(String json) { ... }
}
