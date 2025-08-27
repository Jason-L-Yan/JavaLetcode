package org.example.order.service.impl;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import lombok.extern.slf4j.Slf4j;
import org.example.order.Order;
import org.example.order.feign.ProductFeignClient;
import org.example.order.service.OrderService;
import org.example.product.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.List;

@Slf4j
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    DiscoveryClient discoveryClient;

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Autowired
    ProductFeignClient productFeignClient;

    @SentinelResource(value = "createOrder", blockHandler = "createOrderFallback")
    @Override
    public Order createOrder(Long productId, Long userId) {
//        Product product = getProductFromRemoteWithLoadBalanceAnnotation(productId);
        Product product = productFeignClient.getProductById(productId);
        Order order = new Order();
        order.setId(1L);
        BigDecimal totalPrice = product.getPrice().multiply(new BigDecimal(product.getNum()));
        order.setTotalAmount(totalPrice);
        order.setUserId(userId);
        order.setNickName("张三");
        order.setAddress("尚硅谷");
        order.setProductList(List.of(product));
        return order;
    }

    public Order createOrderFallback(Long productId, Long userId, BlockException blockException) {
        Order order = new Order();
        order.setId(0L);
        order.setTotalAmount(new BigDecimal("0"));
        order.setUserId(userId);
        order.setNickName("未知用户");
        order.setAddress("异常信息：" + blockException.getMessage());
        return order;
    }

    /**
     * 版本一：没有负载均衡，从远程服务获取商品信息
     *
     * @param productId 商品ID，用于标识要获取的商品
     * @return Product 商品对象，包含商品的详细信息
     */
    private Product getProductFromRemote(Long productId) {
        List<ServiceInstance> instances = discoveryClient.getInstances("service-product");
        // 每次都给第一个服务发送请求，如果第一个服务崩了，第二个就变成第一个了，有健壮性。
        // 但是当第一个服务没有崩时，所有请求都在第一个服务没有负载均衡
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/product/" + productId;
        log.info("远程请求路径：{}", url);
        return restTemplate.getForObject(url, Product.class);
    }


    /**
     * 版本二：通过负载均衡方式从远程服务获取商品信息
     *
     * @param productId 商品ID，用于指定要获取的商品
     * @return Product 商品对象，包含商品的详细信息
     */
    private Product getProductFromRemoteWithLoadBalance(Long productId) {
        // 通过负载均衡客户端选择可用的服务实例
        ServiceInstance serviceInstance = loadBalancerClient.choose("service-product");
        // 构造完整的请求URL路径
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/product/" + productId;
        log.info("远程请求路径：{}", url);
        // 发送HTTP GET请求并返回商品对象
        return restTemplate.getForObject(url, Product.class);
    }

    /**
     * 版本三：基于注解式的负载均衡方式，从远程服务获取商品信息
     *
     * @param productId 商品ID，用于指定要获取的商品
     * @return Product 商品对象，包含商品的详细信息
     */
    private Product getProductFromRemoteWithLoadBalanceAnnotation(Long productId) {
        // 构造完整的请求URL路径
        String url = "http://service-product/product/" + productId;
        log.info("远程请求路径：{}", url);
        // 发送HTTP GET请求并返回商品对象
        return restTemplate.getForObject(url, Product.class);
    }

}
