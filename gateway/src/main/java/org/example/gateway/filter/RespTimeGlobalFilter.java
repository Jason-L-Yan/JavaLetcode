package org.example.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

@Slf4j
@Component
public class RespTimeGlobalFilter implements GlobalFilter, Ordered {

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String url = exchange.getRequest().getURI().toString();
        long start = System.currentTimeMillis();
        log.info("请求【{}】开始, 时间：{}", url, start);
        // 以上时前置逻辑
        return chain.filter(exchange).doFinally(result -> {
            // 以下是后置逻辑, 即请求成功之后
            long end = System.currentTimeMillis();
            log.info("请求【{}】结束, 时间：{}，耗时：{}", url, end, end - start);
        });
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
