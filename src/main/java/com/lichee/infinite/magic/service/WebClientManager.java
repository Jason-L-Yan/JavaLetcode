package com.lichee.infinite.magic.service;

import com.intellij.openapi.application.ApplicationManager;
import com.intellij.openapi.components.Service;
import org.springframework.http.client.reactive.ReactorClientHttpConnector;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.netty.http.client.HttpClient;

import java.time.Duration;

/**
 * WebClient 管理器 - 使用 IntelliJ 的 Service 机制而不是 Spring 的 Configuration
 */
@Service(Service.Level.APP) // 应用级服务，整个 IDE 共享一个实例
public final class WebClientManager {
    private final WebClient webClient;

    public WebClientManager() {
        // 创建 Reactor Netty 的 HttpClient 配置
        HttpClient httpClient = HttpClient.create()
                .responseTimeout(Duration.ofSeconds(30))
                .followRedirect(true);

        // 创建 WebClient 实例
        this.webClient = WebClient.builder()
                .clientConnector(new ReactorClientHttpConnector(httpClient))
                .codecs(configurer -> configurer
                        .defaultCodecs()
                        .maxInMemorySize(16 * 1024 * 1024)) // 16MB
                .build();
    }

    /**
     * 获取 WebClient 实例
     */
    public WebClient getWebClient() {
        return webClient;
    }

    /**
     * 获取服务实例
     */
    public static WebClientManager getInstance() {
        return ApplicationManager.getApplication().getService(WebClientManager.class);
    }
}
