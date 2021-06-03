package com.huawei.javase.thread;

/*
����Thread.sleep()������һ�������⣺
 */
public class ThreadTest7 {
    public static void main(String[] args) {
        // �����̶߳���(��̬)
        Thread t = new MyThread3();
        t.setName("t");
        t.start();

        //����sleep����
        try {
            // ���⣺���д�������߳�t��������״̬��
            // ��Ϊsleep�Ǿ�̬��������ʹ������ t ȥ���ã�����sleepû��ϵ��
            // ��ִ�е�ʱ���ǻ�ת���ɣ�Thread.sleep(1000 * 5);
            // ���д���������ǣ��õ�ǰ�߳̽������ߣ�Ҳ����˵main�߳̽������ߡ�
            // �������������main�����У�main�߳�˯�ߡ�t��ȫ����Ӱ�졣
            t.sleep(1000 * 5);  // �����ϻ���Thread.sleep(1000 * 5);
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