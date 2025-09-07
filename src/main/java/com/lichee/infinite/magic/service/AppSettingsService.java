package com.lichee.infinite.magic.service;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.PersistentStateComponent;
import com.intellij.openapi.components.State;
import com.intellij.openapi.components.Storage;
import com.intellij.util.xmlb.XmlSerializerUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * 应用级设置服务，持久化存储 API 和 Token。
 * 使用轻量级 Service 注解与持久化 State。
 */
@State(
        name = "aiAssistant.AppSettingsService", // 状态组件名称，用于存储
        storages = @Storage("ai-assistant-settings.xml") // 存储文件名
)
public final class AppSettingsService implements PersistentStateComponent<AppSettingsService.State> {

    /**
     * 内部状态类，用于 XML 序列化。
     */
    public static class State {
        public String apiUrl = "";
        public String apiToken = "";
        public String modelName = "deepseek-chat"; // 默认模型
        public String systemPrompt = ""; // 新增系统提示词字段

        public State() {
        }

        public State(String apiUrl, String apiToken, String modelName, String systemPrompt) {
            this.apiUrl = apiUrl;
            this.apiToken = apiToken;
            this.modelName = modelName;
            this.systemPrompt = systemPrompt;
        }
    }

    private State myState = new State();

    /**
     * 获取此服务的单例实例。
     */
    public static AppSettingsService getInstance() {
        return ApplicationManager.getApplication().getService(AppSettingsService.class);
    }

    public String getApiUrl() {
        return myState.apiUrl;
    }

    public void setApiUrl(String apiUrl) {
        myState.apiUrl = apiUrl;
    }

    public String getApiToken() {
        return myState.apiToken;
    }

    public void setApiToken(String apiToken) {
        myState.apiToken = apiToken;
    }

    // 添加对应的 getter 和 setter 方法
    public String getSystemPrompt() {
        return myState.systemPrompt;
    }

    public void setSystemPrompt(String systemPrompt) {
        myState.systemPrompt = systemPrompt;
    }

    // 同时添加对应的 getter 和 setter 方法
    public String getModelName() {
        return myState.modelName;
    }

    public void setModelName(String modelName) {
        myState.modelName = modelName;
    }

    @Nullable
    @Override
    public State getState() {
        return myState;
    }

    @Override
    public void loadState(@NotNull State state) {
        XmlSerializerUtil.copyBean(state, this.myState);
    }
}
