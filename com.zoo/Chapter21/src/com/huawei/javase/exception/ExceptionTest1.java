/*
1��ʲô���쳣��java�ṩ�쳣���������ʲô�ã�
    ���³���ִ�й����з����˲�����������������ֲ�����������������쳣
    java�����Ǻ����Ƶ����ԣ��ṩ���쳣�Ĵ���ʽ�����³���ִ�й����г����˲����������
    java�Ѹ��쳣��Ϣ��ӡ���������̨��������Ա�ο�������Ա�����쳣��Ϣ֮�󣬿��Զ�
    ��������޸ģ��ó�����ӵĽ�׳��

    ʲô���쳣������ִ�й����еĲ����������
    �쳣�����ã���ǿ����Ľ�׳�ԡ�

2�����³���ִ�п���̨�����ˣ�
    Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at com.bjpowernode.javase.exception.ExceptionTest01.main(ExceptionTest01.java:14)
	�����Ϣ�����ǳ�Ϊ���쳣��Ϣ�������Ϣ��JVM��ӡ�ġ�
 */
package com.huawei.javase.exception;

public class ExceptionTest1 {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        // ʵ����JVM��ִ�е��˴���ʱ�򣬻�new�쳣����new ArithmeticException("/ by zero");
        // ����JVM��new���쳣�����׳�����ӡ�����Ϣ������̨�ˡ�
        int c = a / b;
        System.out.println(a + "��" + b + "=" + c);
    }
}
