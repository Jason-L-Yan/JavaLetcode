package org.example.product.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.example.product.Product;
import org.example.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
    @Autowired
    ProductService productService;

    @GetMapping("/product/{id}")
    public Product getProduct(@PathVariable("id") Long productId, HttpServletRequest request) {
        String token = request.getHeader("x-token");
        System.out.println("Hello....token = " + token);
        return productService.getProductById(productId);
    }

}
