package com.huawei.javase.thread;

/*
采用匿名内部类可以吗？
 */
public class ThreadTest4 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t线程------>" + i);
                }
            }

        });

        // 启动线程
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main线程---> " + i);
        }
    }
}
