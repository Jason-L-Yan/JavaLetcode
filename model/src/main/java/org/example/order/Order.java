package org.example.order;

import lombok.Getter;
import lombok.Setter;
import org.example.product.Product;

import java.math.BigDecimal;
import java.util.List;

@Getter
@Setter
public class Order {
    private Long id;
    private BigDecimal totalAmount;
    private Long userId;
    private String nickName;
    private String address;
    private List<Product> productList;
}
