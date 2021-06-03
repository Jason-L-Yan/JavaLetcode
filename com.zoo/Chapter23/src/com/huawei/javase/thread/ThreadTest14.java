package com.huawei.javase.thread;

/*
�ػ��߳�
 */
public class ThreadTest14 {
    public static void main(String[] args) {
        Thread t = new BakDataThread();
        t.setName("�������ݵ��߳�");
        // �����߳�֮ǰ�����߳�����Ϊ�ػ��߳�
        t.setDaemon(true);
        t.start();
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

class BakDataThread extends Thread {

    @Override
    public void run() {
        int i = 0;
        // ��ʹ����ѭ���������ڸ��߳����ػ��ߣ����û��߳̽������ػ��߳��Զ���ֹ��
        while (true) {
            System.out.println(Thread.currentThread().getName() + "*****>>" + (++i));
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
