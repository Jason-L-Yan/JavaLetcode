package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
�쳣�����������ǳ���Ҫ�ķ�����

    ��ȡ�쳣�򵥵�������Ϣ��
        String msg = exception.getMessage();

    ��ӡ�쳣׷�ٵĶ�ջ��Ϣ��
        exception.printStackTrace();
 */
public class ExceptionTest6 {
    public static void main(String[] args) {
        // new FileNotFoundException();�¶���ʱ�����ù��������ù�����û��throws�����Բ������쳣��
        FileNotFoundException f = new FileNotFoundException();
        // new FileInputStream() ��Ҫ�쳣������ΪFileInputStream�������д���throws
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
        } catch (FileNotFoundException e1) {
            
            e1.printStackTrace();
        }
        System.out.println("========================================================================");
        // ����ֻ��Ϊ�˲���getMessage()������printStackTrace()������
        // ����ֻ��new���쳣���󣬵���û�н��쳣�����׳���JVM����Ϊ����һ����ͨ��java����
        NullPointerException e = new NullPointerException("��ָ���쳣HAHAHA");
        String msg = e.getMessage();  // ��ָ���쳣HAHAHA
        System.out.println(msg);
        // ��ӡ�쳣��ջ��Ϣ
        // java��̨��ӡ�쳣��ջ׷����Ϣ��ʱ�򣬲������첽�̵߳ķ�ʽ��ӡ�ġ�
        e.printStackTrace();
        System.out.println("Hello Kitty");
    }
}
