package org.example.order.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import lombok.extern.slf4j.Slf4j;
import org.example.order.Order;
import org.example.order.properties.OrderProperties;
import org.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
//@RequestMapping("/api/order")
//@RefreshScope
public class OrderController {

    @Autowired
    private OrderService orderService;

//    @Value("${order.timeout}")
//    String orderTimeout;
//
//    @Value("${order.autoConfirm}")
//    String orderAutoConfirm;

    @Autowired
    OrderProperties orderProperties;

    @GetMapping("/config")
    public String config() {
        return "order.timeout=" + orderProperties.getTimeout() + ", order.autoConfirm=" + orderProperties.getAutoConfirm() + ", order.dbUrl=" + orderProperties.getDbUrl();
    }

    @GetMapping("/create")
    public Order createOrder(@RequestParam("productId") Long productId, @RequestParam("userId") Long userId) {
        return orderService.createOrder(productId, userId);
    }

    @GetMapping("/secKill")
    // 为了防止热点功能出现问题，value的值不能与上面路径一致，否则会报异常
    @SentinelResource(value = "secKill-order", fallback = "secKillFallback")
    public Order secKill(@RequestParam("productId") Long productId, @RequestParam("userId") Long userId) {
        Order order = orderService.createOrder(productId, userId);
        order.setId(Long.MAX_VALUE);
        return order;
    }

    public Order secKillFallback(Long productId, Long userId, Throwable e) {
        Order order = new Order();
        order.setId(productId);
        order.setUserId(userId);
        order.setAddress("异常信息" + e.getClass());
        return order;
    }

    @GetMapping("/readDb")
    public String readDB() {
        log.info("read db......");
        return "readBd success...";
    }

    @GetMapping("/writeDb")
    public String writeDB() {
        log.info("write db......");
        return "writeDb success...";
    }
}
