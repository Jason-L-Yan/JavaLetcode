package com.aoligei;

import com.aoligei.handler.MyInvocationHandler;
import com.aoligei.service.GongNeng;
import com.aoligei.service.HelloService;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class MyApp {
    public static void main(String[] args) {
        GongNeng gn = new GongNeng();
        // int num = gn.print("销售");
        // System.out.println("num=" + num);
        InvocationHandler handler = new MyInvocationHandler(gn);
        // 返回一个接口，记住
        HelloService proxy = (HelloService)Proxy.newProxyInstance(gn.getClass().getClassLoader(), gn.getClass().getInterfaces(), handler);
        int value = proxy.print("市场");
        System.out.println(value);
    }
}
