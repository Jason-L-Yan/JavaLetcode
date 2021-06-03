package com.huawei.javase.threadsafe2;

/*
�����˻�
    ʹ���߳�ͬ�����ƣ�����̰߳�ȫ���⡣
 */
public class Account {
    // �˺�
    private String actno;
    private double balance;
    //����
    Object obj = new Object(); // ʵ����������Account�����Ƕ��̹߳���ģ�Account�����е�ʵ������objҲ�ǹ���ġ���

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
        // �����⼸�д���������߳��Ŷӵģ����ܲ�����
        // һ���̰߳�����Ĵ���ȫ��ִ�н���֮����һ���̲߳��ܽ�����
        /*
        �߳�ͬ�����Ƶ��﷨�ǣ�
            synchronized(){
                // �߳�ͬ������顣
            }
            synchronized����С�����д�����������ݡ����൱�ؼ��ġ�
            ������ݱ����Ƕ��̹߳�������ݡ����ܴﵽ���߳��Ŷӡ�

            ()��дʲô��
                ��Ҫ����������Щ�߳�ͬ����
                ����t1��t2��t3��t4��t5����5���̣߳�
                ��ֻϣ��t1 t2 t3�Ŷӣ�t4 t5����Ҫ�Ŷӡ���ô�죿
                ��һ��Ҫ��()��дһ��t1 t2 t3����Ķ��󡣶����
                �������t4 t5��˵���ǹ���ġ�

            ����Ĺ�������ǣ��˻�����
            �˻������ǹ���ģ���ôthis�����˻�����ɣ�����
            ��һ����this������ֻҪ�Ƕ��̹߳�����Ǹ�������С�

            ��java�����У��κ�һ�������С�һ����������ʵ��������Ǳ�ǡ���ֻ�ǰ�������������
            100������100������1������1������

            ���´����ִ��ԭ��
                1������t1��t2�̲߳�������ʼִ�����´����ʱ�򣬿϶���һ����һ����
                2������t1��ִ���ˣ�������synchronized�����ʱ���Զ��ҡ����湲����󡱵Ķ�������
                �ҵ�֮�󣬲�ռ���������Ȼ��ִ��ͬ��������еĳ����ڳ���ִ�й�����һֱ����
                ռ��������ġ�ֱ��ͬ���������������������Ż��ͷš�
                3������t1�Ѿ�ռ�����������ʱt2Ҳ����synchronized�ؼ��֣�Ҳ��ȥռ�к���
                �������������������������t1ռ�У�t2ֻ����ͬ�����������ȴ�t1�Ľ�����
                ֱ��t1��ͬ�������ִ�н����ˣ�t1��黹���������ʱt2���ڵȵ��������Ȼ��
                t2ռ�������֮�󣬽���ͬ�������ִ�г���

                �����ʹﵽ���߳��Ŷ�ִ�С�
                ������Ҫע����ǣ�����������һ��Ҫѡ���ˡ�����������һ��������Ҫ�Ŷ�
                ִ�е���Щ�̶߳���������ġ�
         */
        //Object obj2 = new Object();
        //synchronized (this){
        //synchronized (obj) {  // ������д�ǿ��Ե�
        //synchronized ("abc") { // "abc"���ַ��������ص��С�����д���������̶߳���ͬ��
        //synchronized (null) { // ������ָ�롣
        //synchronized (obj2) { // ������д�Ͳ���ȫ�ˡ���Ϊobj2���ǹ������
        synchronized(this){
            double before = this.getBalance();
            // ȡ��֮������
            double after = before - money;
    
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
    
            // �������
            this.setBalance(after);
            
        }
    }
}
