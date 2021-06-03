package com.huawei.javase.thread;

/*
sleep˯��̫���ˣ����ϣ���������������Ӧ����ô�죿Ҳ����˵��ô����һ������˯�ߵ��̣߳���
    ע�⣺��������ն��̵߳�ִ�У�����ֹ�̵߳�˯�ߡ�
 */
public class ThreadTest8 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable2());
        t.setName("t");
        t.start();

        // ϣ��5��֮��t�߳�������5��֮�����߳�����Ļ�������ˡ���
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        };
        // �ն�t�̵߳�˯�ߣ������ն�˯�ߵķ�ʽ������java���쳣������ơ���
        t.interrupt();  // ���ţ�һ����ˮ��ȥ��
    }
}

class MyRunnable2 implements Runnable {

    // �ص㣺run()���е��쳣����throws��ֻ��try catch
    // ��Ϊrun()�����ڸ�����û���׳��κ��쳣�����಻�ܱȸ����׳�������쳣��
    // ����ֻ��try...catch
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "---->begin");
        try {
            // ˯��һ��
            // ֻ��try catch������throws����Ϊ���಻�ܱȸ����׳��������쳣
            Thread.sleep(1000 * 60 * 60 * 24 * 365);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
       //1��֮��Ż�ִ������
        System.out.println(Thread.currentThread().getName() + "---->end");
        
    }

    // ������������throws,doOther()������д
    /*public void doOther() throws Exception{

    }*/

}
