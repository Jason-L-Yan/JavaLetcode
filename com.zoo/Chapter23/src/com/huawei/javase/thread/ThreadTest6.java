package com.huawei.javase.thread;

/*
�����̵߳�sleep������
    static void sleep(long millis)
    1����̬������Thread.sleep(1000);
    2�������Ǻ���
    3�����ã��õ�ǰ�߳̽������ߣ����롰����״̬��������ռ��CPUʱ��Ƭ���ø������߳�ʹ�á�
        ���д��������A�߳��У�A�߳̾ͻ�������ߡ�
        ���д��������B�߳��У�B�߳̾ͻ�������ߡ�
    4��Thread.sleep()������������������Ч����
        ����ض���ʱ�䣬ȥִ��һ���ض��Ĵ��룬ÿ�����ִ��һ�Ρ�
 */
public class ThreadTest6 {
    public static void main(String[] args) {
        // �õ�ǰ�߳̽������ߣ�˯��5��
        // ��ǰ�߳������̣߳�����
        // try {
        //     Thread.sleep(1000 * 5);
        // } catch (InterruptedException e) {
        //     e.printStackTrace();
        // }

        // 5��֮��ִ������Ĵ���
        // System.out.println("Hello world");
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
