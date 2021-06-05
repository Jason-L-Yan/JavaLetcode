package com.aoligei.javase.reflect;

import java.lang.reflect.Method;
import com.aoligei.javase.service.UserService;

/*
�ص㣺�������գ�ͨ�����������ô����һ������ķ�����
    �����*****

    ������ƣ��ô���ܾ���ͨ���ԣ��ɱ仯�����ݶ���д�������ļ����У�
    �����޸������ļ�֮�󣬴����Ķ���һ���ˣ����õķ���Ҳ��ͬ�ˣ�
    ����java���벻��Ҫ���κθĶ�������Ƿ�����Ƶ�������
 */
public class ReflectTest10 {
    public static void main(String[] args) throws Exception {
        // ��ʹ�÷�����ƣ���ô���÷���
        // ��������
        UserService userService = new UserService();
        // ���÷���
        /*
        Ҫ�ط�����
            Ҫ��1������userService
            Ҫ��2��login������
            Ҫ��3��ʵ���б�
            Ҫ��4������ֵ
         */
        boolean loginSuccess = userService.login("admin", "123");
        System.out.println(loginSuccess ? "��¼�ɹ�" : "��¼ʧ��");

        // ʹ�÷������������һ������ķ�������ô����
        Class userServiceClass = Class.forName("com.aoligei.javase.service.UserService");
        // ��������
        Object obj = userServiceClass.newInstance();
        // ��ȡmethod
        Method loginMethod = userServiceClass.getDeclaredMethod("login", String.class, String.class);
        // Method loginMethod2 = userServiceClass.getDeclaredMethod("login", int.class);  // �ڶ���login����
        // ���÷���
        // ���÷����м���Ҫ�أ� Ҳ��Ҫ4Ҫ�ء�
        // ���������������������Ҫ��һ�������������ס��
        /*
        ��Ҫ�أ�
        loginMethod����
        obj����
        "admin","123" ʵ��
        retValue ����ֵ
         */
        Object retValue = loginMethod.invoke(obj, "admin", "123");
        System.out.println("���������" + retValue);


    }
}
