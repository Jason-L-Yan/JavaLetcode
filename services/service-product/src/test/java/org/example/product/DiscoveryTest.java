package org.example.product;

import com.alibaba.cloud.nacos.discovery.NacosServiceDiscovery;
import com.alibaba.nacos.api.exception.NacosException;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

// 测试类没有使用 @RunWith(SpringRunner.class) 或 @ExtendWith(SpringExtension.class) 启动 Spring 上下文。
@RunWith(SpringRunner.class)
@SpringBootTest
public class DiscoveryTest {
    @Autowired
    public DiscoveryClient discoveryClient;

    @Autowired
    public NacosServiceDiscovery nacosServiceDiscovery;

    @Test
    public void discoveryTest() {
        for (String service : discoveryClient.getServices()) {
            System.out.println("service = " + service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                System.out.println("ip: " + instance.getHost() + "; port = " + instance.getPort() );
            }
        }
    }

    @Test
    public void nacosServiceDiscoveryTest() throws NacosException {
        for (String service : nacosServiceDiscovery.getServices()) {
            System.out.println("service = " + service);
            List<ServiceInstance> instances = discoveryClient.getInstances(service);
            for (ServiceInstance instance : instances) {
                System.out.println("ip: " + instance.getHost() + "; port = " + instance.getPort() );
            }
        }
    }

    /**
     * 测试虚拟线程的使用方法
     * 该测试方法演示了两种创建和启动虚拟线程的方式：
     * 1. 使用Executors.newVirtualThreadPerTaskExecutor()创建虚拟线程执行器
     * 2. 使用Thread.ofVirtual().start()直接创建并启动虚拟线程
     */
    @Test
    public void testVirtualThread() throws ExecutionException, InterruptedException {
        // 方式一：创建虚拟线程执行器，每个任务使用一个虚拟线程
        ExecutorService executorService = Executors.newVirtualThreadPerTaskExecutor();
        Future<Integer> submit = executorService.submit(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello.");
            return 52;
        });
        System.out.println(submit.get());

        // 方式二：直接创建虚拟线程构建器并启动线程
        Thread.Builder.OfVirtual ofVirtual = Thread.ofVirtual();
        Thread thread = ofVirtual.start(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Hello.88855");
        });
        thread.join();
        System.out.println("nihao");
    }
}
