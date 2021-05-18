package com.huawei.javase.exception;

public class ExceptionTest3 {
    
    // ��һ�ִ���ʽ���ڷ���������λ���ϼ���ʹ�ã�throws��������쳣�ļ������ס��׸������ߡ�
    // ������������ж���Ρ����������쳣���ݸ������ߡ���
    /*
    public static void main(String[] args) throws ClassNotFoundException {
        doSome();
    }
     */

    // �ڶ��ִ���ʽ��try..catch���в�׽��
    // ��׽���ڰ��쳣�����ˣ��쳣�����Ľ���ˡ����������ǲ�֪���ġ���
    public static void main(String[] args) {
        
        try {
            doSome();
        } catch (ClassNotFoundException e ) {
            e.printStackTrace();
        }
    }

    public static void doSome() throws ClassNotFoundException {
        System.out.println("doSome!!!");
    }
}
