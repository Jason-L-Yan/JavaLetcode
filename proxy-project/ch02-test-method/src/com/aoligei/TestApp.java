package com.aoligei;

import com.aoligei.service.HelloService;
import com.aoligei.service.impl.HelloServiceImpl;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestApp {
    public static void main(String[] args) {
        // HelloService service = new HelloServiceImpl();
        // service.sayHello("张三");

        // 使用反射机制执行sayHello方法
        try {
            HelloService target = new HelloServiceImpl();
            // class com.aoligei.service.impl.HelloServiceImpl
            System.out.println("*********************" + target.getClass());
            // com.aoligei.service.impl.HelloServiceImpl
            System.out.println("*********************" + target.getClass().getName());
            Method method = HelloService.class.getMethod("sayHello", String.class);
            method.invoke(target, "李四");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
