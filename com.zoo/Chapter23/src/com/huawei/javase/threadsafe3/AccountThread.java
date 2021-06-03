package com.huawei.javase.threadsafe3;

public class AccountThread extends Thread{

    // �����̱߳��빲��ͬһ���˻�����
    private Account act;

    // ͨ�����췽�����ݹ����˻�����
    public AccountThread(Account act) {
        this.act = act;
    }
    
    @Override
    public void run() {
        // run������ִ�б�ʾȡ��Ĳ���
        // ����ȡ��5000
        double money = 5000;
        // ȡ��
        // ���̲߳���ִ���������
        act.withdraw(money);
        System.out.println(Thread.currentThread().getName() + "�˻���" + act.getActno() + "ȡ��ɹ�����" + act.getBalance());
        
    }

    
}
