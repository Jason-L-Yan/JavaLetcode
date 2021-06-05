package com.aoligei.javase.reflect;

import java.lang.reflect.Field;

import com.aoligei.javase.bean.Student;

/*
�������գ�
    ��ôͨ��������Ʒ���һ��java��������ԣ�
        �����Ը�ֵset
        ��ȡ���Ե�ֵget
 */
public class ReflectFieldTest7 {
    public static void main(String[] args) {
        // 1. ���ǲ�ʹ�÷�����ƣ���ôȥ����һ������������أ�
        Student s = new Student();

        // �����Ը�ֵ
        s.no = 1111; //��Ҫ�أ���s�����no���Ը�ֵ1111
                    //Ҫ��1������s
                    //Ҫ��2��no����
                    //Ҫ��3��1111

        // ������ֵ
        // ����Ҫ�أ���ȡs�����no���Ե�ֵ��
        System.out.println(s.no);

        // 2. ʹ�÷�����ƣ���ôȥ����һ����������ԡ���set get��
        Class studentClass = null;
        Object obj = null;
        Field noField = null;
        try {
            studentClass = Class.forName("com.aoligei.javase.bean.Student");
            obj = studentClass.newInstance(); // obj����Student���󡣣��ײ�����޲������췽����  
            
            // ��ȡno���ԣ��������Ե���������ȡField��
            noField = studentClass.getDeclaredField("no"); 
            // getFieldû�С�s�������Է��ص��������е� ���η� �� ���� �� ����
            System.out.println(noField);  // public int com.aoligei.javase.bean.Student.no
            // ��obj����(Student����)��no���Ը�ֵ
            /*
            ��Ȼʹ���˷�����ƣ�������Ҫ�ػ���ȱһ���ɣ�
                Ҫ��1��obj����
                Ҫ��2��no����
                Ҫ��3��2222ֵ
            ע�⣺��������ô��븴���ˣ�����Ϊ��һ����������Ҳ��ֵ�õġ�
            */
            noField.set(obj, 222);  // ��obj�����no���Ը�ֵ2222
            // ��ȡ���Ե�ֵ
            // ����Ҫ�أ���ȡobj�����no���Ե�ֵ��
            System.out.println(noField.get(obj));  // 222

            // ���Է���˽�е�������
            Field nameField = studentClass.getDeclaredField("name");
            // ���Ʒ�װ��������Ƶ�ȱ�㣺���Ʒ�װ�����ܻ�������������»��ᣡ������
            // ����������֮�����ⲿҲ�ǿ��Է���private�ġ�
            nameField.setAccessible(true);

            // ��name���Ը�ֵ
            nameField.set(obj, "jackson");
            // ��ȡname���Ե�ֵ
            System.out.println(nameField.get(obj));

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        }
        

    }
}
