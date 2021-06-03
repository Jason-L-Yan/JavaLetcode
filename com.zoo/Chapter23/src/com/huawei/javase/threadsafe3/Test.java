package com.huawei.javase.threadsafe3;

public class Test {
    public static void main(String[] args) {
        // 创建账户对象（只创建1个）
        Account act = new Account("act-001", 10000);
        // 创建两个线程,都传入相同的act，即共享一个账户。
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        // 设置name
        t1.setName("Q1");
        t2.setName("Q2");
        // 启动线程
        t1.start();
        t2.start();
        
    }
}
