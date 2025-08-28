package org.example.product.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.example.product.Product;
import org.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId, HttpServletRequest request) {
        String token = request.getHeader("x-token");
        System.out.println("Hello....token = " + token);
//        int i = 10 / 0;
//        try {
//            TimeUnit.SECONDS.sleep(2);
//        } catch (InterruptedException e) {
//            log.error("error = {}" + e.getMessage());
//        }
        return productService.getProductById(productId);
    }

}
