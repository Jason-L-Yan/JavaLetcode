package com.huawei.javase.thread;
/*
��ô�������ֹһ���̵߳�ִ�С����ַ�ʽ�Ǻܳ��õġ�
 */
public class ThreadTest10 {
    public static void main(String[] args) {
        MyRunnable4 r = new MyRunnable4();
        Thread t = new Thread(new MyRunnable4());
        t.setName("���߳�һ");
        t.start();

        // ģ��5��
        try {
            Thread.sleep(1000 * 5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // ��ֹ�߳�
        // ����Ҫʲôʱ����ֹt��ִ�У���ô��ѱ���޸�Ϊfalse���ͽ����ˡ�
        r.run = false;
    }
}

class MyRunnable4 implements Runnable {

    // ��һ��Boolean���
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "----->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            } else {
                // return�ͽ����ˣ����ڽ���֮ǰ����ʲôû����ġ�
                // ��������Ա���ѽ��
                //save....

                // ��ֹ��ǰ�߳�
                return;    
            }
        }
    }

}
