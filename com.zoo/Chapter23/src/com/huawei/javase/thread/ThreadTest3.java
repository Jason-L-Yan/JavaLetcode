package com.huawei.javase.thread;
/*
ʵ���̵߳ĵڶ��ַ�ʽ����дһ����ʵ��java.lang.Runnable�ӿڡ�
 */
/*
ʵ���̵߳ĵڶ��ַ�ʽ����дһ����ʵ��java.lang.Runnable�ӿڡ�
 */
public class ThreadTest3 {
    public static void main(String[] args) {
        // ����һ�������еĶ���
        //MyRunnable r = new MyRunnable();
        // �������еĶ����װ��һ���̶߳���
        //Thread t = new Thread(r);
        Thread t = new Thread(new MyRunnable()); // �ϲ�����
        // �����߳�
        t.start();

        for(int i = 0; i < 100; i++){
            System.out.println("���߳�--->" + i);
        }
    }
}

// �Ⲣ����һ���߳��࣬��һ�������е��ࡣ��������һ���̡߳�
class MyRunnable implements Runnable {

    @Override
    public void run() {
        for(int i = 0; i < 100; i++){
            System.out.println("��֧�߳�--->" + i);
        }
    }
}
