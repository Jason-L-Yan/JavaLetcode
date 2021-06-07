package com.aoligei.javase.reflect;

/*
�ص㣺����һ���࣬��ô��ȡ�����ĸ��࣬�Ѿ�ʵ������Щ�ӿڣ�
 */
public class ReflectTest13 {
    public static void main(String[] args) {
        // String����
        Class stringClass = null;
        System.out.println(System.getProperty("java.version"));
        try {
            stringClass = Class.forName("java.lang.String");
            // ��ȡString�ĸ���
            Class superClass = stringClass.getSuperclass();
            System.out.println("���ࣺ" + superClass.getName());

            Class[] interfacesClass = stringClass.getInterfaces();
            for (Class in : interfacesClass) {
                System.out.println("�ӿڣ�" + in.getName());
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
