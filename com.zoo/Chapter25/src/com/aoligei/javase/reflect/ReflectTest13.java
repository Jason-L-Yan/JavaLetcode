package com.aoligei.javase.reflect;

/*
重点：给你一个类，怎么获取这个类的父类，已经实现了哪些接口？
 */
public class ReflectTest13 {
    public static void main(String[] args) {
        // String举例
        Class stringClass = null;
        System.out.println(System.getProperty("java.version"));
        try {
            stringClass = Class.forName("java.lang.String");
            // 获取String的父类
            Class superClass = stringClass.getSuperclass();
            System.out.println("父类：" + superClass.getName());

            Class[] interfacesClass = stringClass.getInterfaces();
            for (Class in : interfacesClass) {
                System.out.println("接口：" + in.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
