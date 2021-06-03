package com.huawei.javase.threadsafe;

/*
�����˻�
    ��ʹ���߳�ͬ�����ƣ����̶߳�ͬһ���˻�����ȡ������̰߳�ȫ���⡣
 */
public class Account {
    // �˺�
    private String actno;
    private double balance;

    public Account() {
    }

    public Account(String actno, double balance) {
        this.actno = actno;
        this.balance = balance;
    }

    public String getActno() {
        return actno;
    }

    public void setActno(String actno) {
        this.actno = actno;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // ȡ��ķ���
    public void withdraw(double money) {
        // t1��t2�������������������t1��t2������ջ������ջ��ͬ����ͬһ������
        // ȡ��֮ǰ�����
        double before = this.getBalance();
        // ȡ��֮������
        double after = before - money;

        // ������ģ�����������ӳ�, 100%������
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // �������
        this.setBalance(after);
    }
}
