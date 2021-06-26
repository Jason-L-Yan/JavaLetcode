package com.aoligei.mysql.reviewjavase;

import java.io.*;

public class Testing2 implements Serializable {
    public static void main(String[] args) {
        // �����������̳߳��õ�ʵ�ַ�ʽ
        MyThread myThread = new MyThread();
        Thread myThread2 = new Thread(new MyRunnable());
        // �����ڲ����ʵ�ַ�ʽ
        Thread myThread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10000; i++) {
                    System.out.println("�����ڲ����֧�߳�---->" + i);
                }
            }
        });
        // lambda���ʽ��ʵ�������ڲ���
        Thread myThread4 = new Thread(()->{
            for (int i = 0; i < 10000; i++) {
                System.out.println("lambda�����ڲ����֧�߳�---->" + i);
            }
        });

        myThread.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        for (int i = 0; i < 10000; i++) {
            System.out.println("���߳�---->" + i);
        }

    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("��֧�߳�11---->" + i);
        }
    }
}

class MyRunnable implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            System.out.println("��֧�߳�22---->" + i);
        }
    }
}
