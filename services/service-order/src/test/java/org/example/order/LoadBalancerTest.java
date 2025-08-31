package org.example.order;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 测试类没有使用 @RunWith(SpringRunner.class) 或 @ExtendWith(SpringExtension.class) 启动 Spring 上下文。
@RunWith(SpringRunner.class)
@SpringBootTest
public class LoadBalancerTest {
    @Autowired
    LoadBalancerClient loadBalancerClient;

    @Test
    public void loadBalanceTest() {
        ServiceInstance choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost() + ":" + choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost() + ":" + choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost() + ":" + choose.getPort());
        choose = loadBalancerClient.choose("service-product");
        System.out.println(choose.getHost() + ":" + choose.getPort());
    }

    @Test
    public void loadBalanceTest2() {
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        Future<?> submit = executorService.submit(() -> {
            ServiceInstance choose = loadBalancerClient.choose("service-product");
            System.out.println(choose.getHost() + ":" + choose.getPort());
        });
        try {
            submit.get();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }
    }
}
