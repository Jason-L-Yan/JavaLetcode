package com.aoligei.mysql.reviewjavase;

import java.io.*;

public class Testing2 implements Serializable {
    public static void main(String[] args) {
        // 以下两种是线程常用的实现方式
        MyThread myThread = new MyThread();
        Thread myThread2 = new Thread(new MyRunnable());
        // 匿名内部类的实现方式
        Thread myThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("匿名内部类分支线程---->" + i);
                }
            }
        });
        // lambda表达式，实现匿名内部类
        Thread myThread4 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("lambda匿名内部类分支线程---->" + i);
            }
        });

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("主线程---->" + i);
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("分支线程11---->" + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("分支线程22---->" + i);
        }
    }
}
