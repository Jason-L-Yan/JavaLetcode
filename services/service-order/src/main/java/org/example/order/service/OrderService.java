package org.example.order.service;

import org.example.order.Order;

public interface OrderService {
    Order createOrder(Long productId, Long userId);
}
