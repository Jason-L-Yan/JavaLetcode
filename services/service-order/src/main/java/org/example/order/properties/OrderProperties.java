package org.example.order.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "order")  // 配置在批量绑定nacos下，可以无需RefreshScope就能实现自动刷新
@Getter
@Setter
public class OrderProperties {
    String timeout;

    String autoConfirm;
}
