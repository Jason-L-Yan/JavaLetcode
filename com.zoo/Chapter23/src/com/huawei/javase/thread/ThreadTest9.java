package com.huawei.javase.thread;
/*
��java����ôǿ����ֹһ���̵߳�ִ�С�
    ���ַ�ʽ���ںܴ��ȱ�㣺���׶�ʧ���ݡ���Ϊ���ַ�ʽ��ֱ�ӽ��߳�ɱ���ˣ�
    �߳�û�б�������ݽ��ᶪʧ��������ʹ�á�
 */

public class ThreadTest9 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable3());
        t.setName("���߳�1");
        t.start();
        // ģ��5����
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5����֮��ǿ����ֹt�߳�
        t.stop();  // �ѹ�ʱ��������ʹ�ã�
    }
}

class MyRunnable3 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName() + "----->" + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}