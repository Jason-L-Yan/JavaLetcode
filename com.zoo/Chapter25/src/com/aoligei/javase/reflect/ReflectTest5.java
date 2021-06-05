package com.aoligei.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/*
反射Student类当中所有的Field（了解一下）
 */
public class ReflectTest5 {
    public static void main(String[] args) {
        // 获取整个类
        Class studentClass = null;
        try {
            studentClass = Class.forName("com.aoligei.javase.bean.Student");
            // System.out.println(studentClass.getName());  // com.aoligei.javase.bean.Student
            // System.out.println(studentClass.getSimpleName());  // Student
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        // 1. 获取公共的属性的Field
        Field[] field = studentClass.getFields();
        // System.out.println(field.length);  // 1
        Field f = field[0];
        String fieldName = f.getName();
        System.out.println(fieldName);


        // 2. 获取所有属性的Field
        Field[] fs = studentClass.getDeclaredFields();
        System.out.println(fs.length);

        for (Field d : fs) {
            // System.out.println(d);
            // 输出：
            // private java.lang.String com.aoligei.javase.bean.Student.name
            // protected int com.aoligei.javase.bean.Student.age
            // boolean com.aoligei.javase.bean.Student.sex
            // public int com.aoligei.javase.bean.Student.no
            
            // 获取属性的名字
            // System.out.println(d.getName());
            // 输出：
            // name
            // age
            // sex
            // no

            // 获取属性的类型
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

            // 获取属性的权限
            int i = d.getModifiers();  // 返回的修饰符是数字，每个数字是修饰符的代号。
            String modifierToString = Modifier.toString(i);
            System.out.println(modifierToString);
            // 输出：
            // private
            // protected
                            // 此处是空白，因为是Boolean类型
            // public
            // public static final

        }
    }
}
