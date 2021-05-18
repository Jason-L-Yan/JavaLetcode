/*
final finally finalize��ʲô����
    final �ؼ���
        final���ε����޷��̳�
        final���εķ����޷�����
        final���εı����������¸�ֵ��

    finally �ؼ���
        ��tryһ������ʹ�á�
        finally�����еĴ����Ǳ���ִ�еġ�

    finalize ��ʶ��
        ��һ��Object���еķ�������
        ���������������������GC������õġ�
 */
package com.huawei.javase.exception;

public class ExceptionTest14 {
    public static void main(String[] args) {
        // final��һ���ؼ��֡���ʾ���յġ�����ġ�
        final int i = 100;
        //i = 200;

        // finallyҲ��һ���ؼ��֣���try����ʹ�ã�ʹ�����쳣���������
        // ��fianlly�����еĴ�����һ����ִ�еġ�
        try {

        } finally {
            System.out.println("finally....");
        }

        // finalize()��Object���е�һ����������Ϊ���������֡�
        // ����finalize�Ǳ�ʶ����
        // finalize()������JVM��GC����������������á�
        Object obj;
    }
}

// final���ε����޷��̳�
final class A {
    // ������
    public static final double MATH_PI = 3.1415926;
}

class B {
    // final���εķ����޷�����
    public final void doSome(){

    }
}