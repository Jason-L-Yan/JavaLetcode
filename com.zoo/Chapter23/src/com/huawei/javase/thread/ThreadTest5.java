package com.huawei.javase.thread;

public class ThreadTest5 {
    public static void main(String[] args) {

        Thread currenThread = Thread.currentThread();
        // getName() + "," + getPriority() + "," + group.getName()
        System.out.println(currenThread);  // Thread[main,5,main]
        
        // �����̶߳���
        MyThread2 t = new MyThread2();
        // ��ȡ�߳�����
        // System.out.println(t.getName());  // Thread-0
        // �����߳�����
        t.setName("t1");
        System.out.println(t.getName());  // t1
        t.start();  // Thread[t1,5,main]
        
        MyThread2 t2 = new MyThread2();
        t2.setName("t2");  
        System.out.println(t2.getName());  // t2
        t2.start();  // Thread[t2,5,main]

    }
}

class MyThread2 extends Thread {

    @Override
    public void run() {
        Thread currenThread = Thread.currentThread();
        System.out.println("����" + currenThread);
        System.out.println("����" + super.getName());

    }
    
}