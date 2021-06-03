package com.huawei.javase.threadsafe3;

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
    /*
    ��ʵ�������Ͽ���ʹ��synchronized�𣿿��Եġ�
        synchronized������ʵ�������ϣ�һ��������this��
        û������ֻ����this�������������Ķ����ˡ�
        �������ַ�ʽ����

        ���⻹��һ��ȱ�㣺synchronized������ʵ�������ϣ�
        ��ʾ���������嶼��Ҫͬ�������ܻ��޹�����ͬ����
        ��Χ�����³����ִ��Ч�ʽ��͡��������ַ�ʽ�����á�

        synchronizedʹ����ʵ����������ʲô�ŵ㣿
            ����д�����ˡ��ڼ��ˡ�

        �������Ķ������this��������Ҫͬ���Ĵ���������������壬
        ����ʹ�����ַ�ʽ��
     */
    public synchronized void withdraw(double money) {
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
