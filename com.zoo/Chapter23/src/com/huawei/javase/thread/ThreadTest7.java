package com.huawei.javase.thread;

/*
关于Thread.sleep()方法的一个面试题：
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        // 创建线程对象。(多态)
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //调用sleep方法
        try {
            // 问题：这行代码会让线程t进入休眠状态吗？
            // 因为sleep是静态方法，即使用引用 t 去调用，它和sleep没关系，
            // 在执行的时候还是会转换成：Thread.sleep(1000 * 5);
            // 这行代码的作用是：让当前线程进入休眠，也就是说main线程进入休眠。
            // 这样代码出现在main方法中，main线程睡眠。t完全不受影响。
            t.sleep(1000 * 5);  // 本质上还是Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Hello World!");
    }
}

class MyThread3 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println(Thread.currentThread().getName() + "---->" + i);
        }
    }
    
}