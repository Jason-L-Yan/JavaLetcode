package com.huawei.javase.exam2;

// �����⣺doOther����ִ�е�ʱ����Ҫ�ȴ�doSome�����Ľ�����
    //��Ҫ,��Ϊsynchronized��ס����this������󣬼�mc
public class Exam01 {
    public static void main(String[] args) throws InterruptedException {
        MyClass mc = new MyClass();

        Thread t1 = new MyThread(mc);
        Thread t2 = new MyThread(mc);

        t1.setName("t1");
        t2.setName("t2");

        t1.start();
        Thread.sleep(1000); // ���˯�ߵ������ǣ�Ϊ�˱�֤t1�߳���ִ�С�
        t2.start();
    }
}

class MyThread extends Thread {
    private MyClass mc;

    public MyThread(MyClass mc) {
        this.mc = mc;
    }

    public void run() {
        if (Thread.currentThread().getName().equals("t1")) {
            mc.doSome();
        }
        if (Thread.currentThread().getName().equals("t2")) {
            mc.doOther();
        }
    }
}

class MyClass {
    public synchronized void doSome() {
        System.out.println("doSome begin");
        try {
            Thread.sleep(1000 * 10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("doSome over");
    }

    public synchronized void doOther() {
        System.out.println("doOther begin");
        System.out.println("doOther over");
    }
}
