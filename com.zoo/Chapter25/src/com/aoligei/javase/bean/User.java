package com.aoligei.javase.bean;

public class User {
    
    public int age;
    
    static {
        System.out.println("你好，中国");
    }
    public User() {
        System.out.println("无参数构造方法!!!");
    }

    public User(String s) {

    }

    public void sun() {
        System.out.println("方法体调用测试！");
    }
}
