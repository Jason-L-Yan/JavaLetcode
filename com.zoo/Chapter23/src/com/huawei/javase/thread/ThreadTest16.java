package com.huawei.javase.thread;

import java.util.ArrayList;
import java.util.List;

/*
1��ʹ��wait������notify����ʵ�֡������ߺ�������ģʽ��

2��ʲô�ǡ������ߺ�������ģʽ����
    �����̸߳��������������̸߳������ѡ�
    �����̺߳������߳�Ҫ�ﵽ���⡣
    ����һ�������ҵ������������������������Ҫʹ��wait������notify������

3��wait��notify���������̶߳���ķ���������ͨjava�����еķ�����

4��wait������notify�����������߳�ͬ���Ļ���֮�ϡ���Ϊ���߳�Ҫͬʱ����һ���ֿ⡣���̰߳�ȫ���⡣

5��wait�������ã�o.wait()������o�����ϻ���߳�t����ȴ�״̬�������ͷŵ�t�߳�֮ǰռ�е�o���������

6��notify�������ã�o.notify()������o�����ϵȴ����̻߳��ѣ�ֻ��֪ͨ�������ͷ�o������֮ǰռ�е�����

7��ģ������һ������
    �ֿ����ǲ���List���ϡ�
    List�����м���ֻ�ܴ洢1��Ԫ�ء�
    1��Ԫ�ؾͱ�ʾ�ֿ����ˡ�
    ���List������Ԫ�ظ�����0���ͱ�ʾ�ֿ���ˡ�
    ��֤List��������Զ�������洢1��Ԫ�ء�

    ������������Ч��������1������1����
 */
public class ThreadTest16 {
    public static void main(String[] args) {
        List list = new ArrayList();
        Thread t1 = new Thread(new Producer(list));
        Thread t2 = new Thread(new Consumer(list));
        t1.setName("�������߳�");
        t2.setName("�������߳�");
        t1.start();
        t2.start();
    }
}

class Producer implements Runnable {

    private List list;

    public Producer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
               
                if (list.size() > 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj = new Object();
                list.add(obj);
                System.out.println(Thread.currentThread().getName() + "---->" + obj);
                list.notifyAll();
            }
        }
    }

}

class Consumer implements Runnable {

    private List list;

    public Consumer(List list) {
        this.list = list;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (list) {
                if (list.size() == 0) {
                    try {
                        list.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                Object obj  = list.remove(0);
                System.out.println(Thread.currentThread().getName() + "---->" + obj);
                list.notifyAll();
            }
        }
    }

}
