package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest7 {
    public static void main(String[] args) {
        try {
            m1();
            System.out.println("Hello Kitty");
        } catch (FileNotFoundException e) {
            // ��ȡ�쳣�ļ�������Ϣ
            String msg = e.getMessage();
            System.out.println(msg); //C:\jetns-agent.jar (ϵͳ�Ҳ���ָ�����ļ���)
            //��ӡ�쳣��ջ׷����Ϣ������
            //��ʵ�ʵĿ����У�����ʹ����������ɺ�ϰ�ߣ�
            // ���д���Ҫд�ϣ���Ȼ��������Ҳ��֪����
            e.printStackTrace();
            System.out.println("You!!!!!!!!!!!!!!!");
            /*
            java.io.FileNotFoundException: C:\jetns-agent.jar (ϵͳ�Ҳ���ָ�����ļ���)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
                at com.bjpowernode.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:31)
                at com.bjpowernode.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:27)
                at com.bjpowernode.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:23)
                at com.bjpowernode.javase.exception.ExceptionTest09.main(ExceptionTest09.java:14)
                ��Ϊ31�г����⵼����27��
                27�г����⵼��23��
                23�г����⵼��14�С�
                Ӧ���Ȳ鿴31�еĴ��롣31���Ǵ������ĸ�Դ��
             */
        }
        System.out.println("���ϣ�����Ŷ��");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new  FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
    }

}
