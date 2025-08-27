package org.example.order.feign.fallback;

import org.example.order.feign.ProductFeignClient;
import org.example.product.Product;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class ProductFeignClientFallback implements ProductFeignClient {
    @Override
    public Product getProductById(Long productId) {
        System.out.println("兜底数据。。。。");
        Product product = new Product();
        product.setId(productId);
        product.setPrice(new BigDecimal("0"));
        product.setProductName("未知商品");
        product.setNum(0);
        return product;
    }
}
