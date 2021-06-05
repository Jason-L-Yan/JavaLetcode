package com.aoligei.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
����Student�൱�����е�Field���˽�һ�£�
 */
public class ReflectTest5 {
    public static void main(String[] args) {
        // ��ȡ������
        Class studentClass = null;
        try {
            studentClass = Class.forName("com.aoligei.javase.bean.Student");
            // System.out.println(studentClass.getName());  // com.aoligei.javase.bean.Student
            // System.out.println(studentClass.getSimpleName());  // Student
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 1. ��ȡ���������Ե�Field
        Field[] field = studentClass.getFields();
        // System.out.println(field.length);  // 1
        Field f = field[0];
        String fieldName = f.getName();
        System.out.println(fieldName);


        // 2. ��ȡ�������Ե�Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);

        for (Field d : fs) {
            // System.out.println(d);
            // �����
            // private java.lang.String com.aoligei.javase.bean.Student.name
            // protected int com.aoligei.javase.bean.Student.age
            // boolean com.aoligei.javase.bean.Student.sex
            // public int com.aoligei.javase.bean.Student.no
            
            // ��ȡ���Ե�����
            // System.out.println(d.getName());
            // �����
            // name
            // age
            // sex
            // no

            // ��ȡ���Ե�����
            // Class fieldType = d.getType();
            // System.out.println(fieldType.getName());
            // java.lang.String
            // int1
            // boolean
            // int
            // System.out.println(fieldType.getSimpleName());
            // String
            // int
            // boolean
            // int

            // ��ȡ���Ե�Ȩ��
            int i = d.getModifiers();  // ���ص����η������֣�ÿ�����������η��Ĵ��š�
            String modifierToString = Modifier.toString(i);
            System.out.println(modifierToString);
            // �����
            // private
            // protected
                            // �˴��ǿհף���Ϊ��Boolean����
            // public
            // public static final

        }
    }
}
