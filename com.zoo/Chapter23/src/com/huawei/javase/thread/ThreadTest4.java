package com.huawei.javase.thread;

/*
���������ڲ��������
 */
public class ThreadTest4 {
    public static void main(String[] args) {

        Thread t = new Thread(new Runnable() {

            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("t�߳�------>" + i);
                }
            }

        });

        // �����߳�
        t.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main�߳�---> " + i);
        }
    }
}
