package com.huawei.javase.threadsafe;

public class Test {
    public static void main(String[] args) {
        // �����˻�����ֻ����1����
        Account act = new Account("act-001", 10000);
        // ���������߳�,��������ͬ��act��������һ���˻���
        Thread t1 = new AccountThread(act);
        Thread t2 = new AccountThread(act);
        // ����name
        t1.setName("Q1");
        t2.setName("Q2");
        // �����߳�
        t1.start();

        // try {
        //     t1.join();
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        t2.start();
        
    }
}
