package com.aoligei.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import com.aoligei.javase.bean.Vip;

/*
����һ������(ReflectTest11)��ҪһЩ������

ͨ��������Ƶ��ù��췽��ʵ����java���󡣣���������ص㣩
 */
public class ReflectFieldTest12 {
    public static void main(String[] args) {
        Vip v1 = new Vip();
        Vip v2 = new Vip(110, "zhangsan", "2001-10-11", true);

        Class c = null;
        // ʹ�÷��������ô���������أ�
        try {
            c = Class.forName("com.aoligei.javase.bean.Vip");
            Object obj = c.newInstance();
            System.out.println(obj);
            // �����в����Ĺ��췽����ô�죿
            // ��һ�����Ȼ�ȡ������в����Ĺ��췽��
            Constructor con =  c.getDeclaredConstructor(int.class, String.class, String.class, boolean.class);
            // �ڶ��������ù��췽����������
            Object obj2 = con.newInstance(110, "jason", "1900-10-11", true);
            System.out.println(obj2);

            // ��ȡ�޲������췽��
            Constructor con2 = c.getDeclaredConstructor();
            Object newObj2 = con2.newInstance();
            System.out.println(newObj2);

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
