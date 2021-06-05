package com.aoligei.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
作为了解内容（不需要掌握）：
    反射Method
 */
public class ReflectFieldTest8 {
    public static void main(String[] args) {
        Class userServiceClass = null;
        try {
            // 获取类了
            userServiceClass = Class.forName("com.aoligei.javase.service.UserService");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // 获取所有的Method（包括私有的！）
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length); // 3
        for (Method method : methods) {
            // 获取修饰符列表
            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            // 获取方法的返回值类型
            System.out.print(method.getReturnType().getName() + " ");
            // 获取方法名
            System.out.println(method.getName());
            // 方法的修饰符列表（一个方法的参数可能会有多个。
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }

        }
    }
}
