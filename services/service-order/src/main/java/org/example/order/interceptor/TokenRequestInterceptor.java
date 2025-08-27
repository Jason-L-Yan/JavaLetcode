package org.example.order.interceptor;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.springframework.stereotype.Component;

import java.util.UUID;

/**
 * 请求拦截器
 */
@Component
public class TokenRequestInterceptor implements RequestInterceptor {
    @Override
    public void apply(RequestTemplate requestTemplate) {
        System.out.println("拦截器工作了....... ");
        requestTemplate.header("x-token", UUID.randomUUID().toString());
    }
}
