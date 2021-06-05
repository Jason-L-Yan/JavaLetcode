package com.aoligei.javase.reflect;

import com.aoligei.javase.bean.User;

/*
��ȡ��Class���ܸ�ʲô��
    ͨ��Class��newInstance()������ʵ��������
    ע�⣺newInstance()�����ڲ�ʵ���ϵ������޲������췽�������뱣֤�޲ι�����ڲſ��ԡ�
 */
public class ReflectTest2 {
    public static void main(String[] args) {
        // ���ǲ�ʹ�÷�����ƣ���������
        User user = new User();
        System.out.println(user);

        // ������δ������Է�����Ƶķ�ʽ��������
        try {
            // ͨ��������ƣ���ȡClass��ͨ��Class��ʵ��������
            Class c = Class.forName("com.aoligei.javase.bean.User"); // c����User���͡�
            // newInstance() ������������User�������޲������췽������ɶ���Ĵ�����
            // �ص��ǣ�newInstance()���õ����޲ι��죬���뱣֤�޲ι����Ǵ��ڵģ�
            Object obj = c.newInstance(); // �޲������췽��

            System.out.println(obj); // com.aoligei.javase.bean.User@2ff4acd0
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}
