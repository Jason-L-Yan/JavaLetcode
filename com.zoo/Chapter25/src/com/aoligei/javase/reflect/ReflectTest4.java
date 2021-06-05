package com.aoligei.javase.reflect;

/*
�о�һ�£�Class.forName()������ʲô��
    ��ס���ص㣺
        �����ֻ��ϣ��һ����ľ�̬�����ִ�У���������һ�ɲ�ִ�У�
        �����ʹ�ã�
            Class.forName("��������");
        ���������ִ�лᵼ������أ������ʱ����̬�����ִ�С�

��ʾ��
    ����JDBC������ʱ�����ǻ���Ҫ��
 */
public class ReflectTest4 {
    public static void main(String[] args) {
        Class c;
        try {
            c = Class.forName("com.aoligei.javase.reflect.MyClass");
            // �Ͼ����ִ�н����MyClass��ľ�̬�����ִ���ˣ�
            c.newInstance();
            // ����������ִ�н����
            // MyClass��ľ�̬�����ִ���ˣ�
            // �޲ι�����ִ���ˣ�
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    static {
        System.out.println("MyClass��ľ�̬�����ִ���ˣ�");
    }

    public MyClass() {
        System.out.println("�޲ι�����ִ���ˣ�");
    }

}
