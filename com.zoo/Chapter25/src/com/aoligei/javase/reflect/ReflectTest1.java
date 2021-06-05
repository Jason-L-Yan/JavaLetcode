package com.aoligei.javase.reflect;

import java.util.Date;

/*
Ҫ����һ������ֽ��룬��Ҫ���Ȼ�ȡ���������ֽ��룬��ô��ȡjava.lang.Classʵ����
    ���ַ�ʽ
        ��һ�֣�Class c = Class.forName("��������������");
        �ڶ��֣�Class c = ����.getClass();
        �����֣�Class c = �κ�����.class;

 */
public class ReflectTest1 {
    public static void main(String[] args) {
        /*
        Class.forName()
            1����̬����
            2�������Ĳ�����һ���ַ�����
            3���ַ�����Ҫ����һ������������
            4����������������а�����java.lang��Ҳ����ʡ�ԡ�
         */
        Class c1 = null;
        Class c2 = null;

        try {
            c1 = Class.forName("java.lang.String");  // c1����String.class�ļ�������˵c1����String���͡�
            c2 = Class.forName("java.util.Date");  // c2����Date����
            Class c3 = Class.forName("java.lang.Integer");  // c3����Integer����
            Class c4 = Class.forName("java.lang.System");  // c4����System����
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // java���κ�һ��������һ��������getClass()
        String s = "abc";
        Class x = s.getClass(); // x����String.class�ֽ����ļ���x����String���͡�
        System.out.println("x�������������ͣ�" + x);
        System.out.println(c1 == x); // true��==�жϵ��Ƕ�����ڴ��ַ����

        Date time = new Date();
        Class y = time.getClass();
        System.out.println(c2 == y); // true (c2��y���������б�����ڴ��ַ����һ���ģ���ָ�򷽷����е��ֽ����ļ���)

        // �����ַ�ʽ��java�������κ�һ�����ͣ����������������ͣ�������.class���ԡ�
        Class z = String.class; // z����String����
        Class k = Date.class; // k����Date����
        Class f = int.class; // f����int����
        Class e = double.class; // e����double����

        System.out.println(x == z); // true

    }

}
