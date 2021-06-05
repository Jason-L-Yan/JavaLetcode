package com.aoligei.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

//通过反射机制，反编译一个类的属性Field（了解一下）
public class ReflectFieldTest6 {
    public static void main(String[] args) {
        StringBuilder s = new StringBuilder();
        // s.append("public class ReflectFieldTest6{");
        // s.append("}");
        // System.out.println(s);
        Class studentClass = null;
        try {
            studentClass = Class.forName("java.lang.String");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        s.append(Modifier.toString(studentClass.getModifiers()) + " class " + studentClass.getSimpleName() + "{\n");
        Field[] fields = studentClass.getDeclaredFields();
        for (Field field : fields) {
            s.append("\t");
            s.append(Modifier.toString(field.getModifiers()));
            s.append(" ");
            s.append(field.getType().getSimpleName());
            s.append(" ");
            s.append(field.getName());
            s.append(";\n");

        }
        s.append("}");
        System.out.println(s);

    }
}
