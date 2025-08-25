package org.example.order.controller;

import org.example.order.Order;
import org.example.order.properties.OrderProperties;
import org.example.order.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
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
}
