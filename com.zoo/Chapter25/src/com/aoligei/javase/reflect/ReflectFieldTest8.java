package com.aoligei.javase.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/*
��Ϊ�˽����ݣ�����Ҫ���գ���
    ����Method
 */
public class ReflectFieldTest8 {
    public static void main(String[] args) {
        Class userServiceClass = null;
        try {
            // ��ȡ����
            userServiceClass = Class.forName("com.aoligei.javase.service.UserService");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        // ��ȡ���е�Method������˽�еģ���
        Method[] methods = userServiceClass.getDeclaredMethods();
        System.out.println(methods.length); // 3
        for (Method method : methods) {
            // ��ȡ���η��б�
            System.out.print(Modifier.toString(method.getModifiers()) + " ");
            // ��ȡ�����ķ���ֵ����
            System.out.print(method.getReturnType().getName() + " ");
            // ��ȡ������
            System.out.println(method.getName());
            // ���������η��б�һ�������Ĳ������ܻ��ж����
            Class[] parameterTypes = method.getParameterTypes();
            for (Class parameterType : parameterTypes) {
                System.out.println(parameterType.getSimpleName());
            }

        }
    }
}
