package com.huawei.javase.io;

import java.io.FileOutputStream;
import java.io.PrintStream;

/*
java.io.PrintStream����׼���ֽ��������Ĭ�����������̨��
 */
public class PrintStreamTest {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello World");
        // public static final PrintStream out = null;
        // ��һ�仰������ System.class �С�
        // PrintStream.class�ж�����println()����
        PrintStream ps = System.out;
        ps.println("hello zhangsan");
        ps.println("hello lisi");
        ps.println("hello wangwu");

        // ��׼���������Ҫ�ֶ�close()�رա�
        // ���Ըı��׼���������������� ����

        /*
        // ��Щ��֮ǰSystem��ʹ�ù��ķ��������ԡ�
        System.gc();
        System.currentTimeMillis();
        PrintStream ps2 = System.out;
        System.exit(0);
        System.arraycopy(....);
         */

        // ��׼���������ָ�����̨��ָ��log���ļ���
        PrintStream ps2 = new PrintStream(new FileOutputStream("log"));
        // �޸�������򣬽���������޸ĵ�"log"�ļ���
        System.setOut(ps2);
        // �����
        System.out.println("hello world");
        System.out.println("hello kitty");
        System.out.println("hello zhangsan");

    }
}
