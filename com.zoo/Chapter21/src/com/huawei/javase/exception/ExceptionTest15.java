package com.huawei.javase.exception;

public class ExceptionTest15 {
    public static void main(String[] args) {
        // �����쳣����ֻnew���쳣���󣬲�û���ֶ��׳���
        MyException e = new MyException("�û�������Ϊ��");

        // ��ӡ�쳣��ջ��Ϣ
        e.printStackTrace();

        System.out.println("=======================================");
        // ��ȡ�쳣��������Ϣ
        String msg = e.getMessage();
        System.out.println(msg);
        
    }
}
