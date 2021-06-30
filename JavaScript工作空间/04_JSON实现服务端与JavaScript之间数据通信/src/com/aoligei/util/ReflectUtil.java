package com.aoligei.util;

import java.lang.reflect.Field;

public class ReflectUtil {
    // 作用：将任意类型对象内容转换为JSON格式字符串返回
    //参数：一个高级引用类型对象 Student对象  ，Dept对象，。。。。。
    public static String jasonObject(Object obj) {
        Class classFile = null;
        Field fieldArray[] = null;
        StringBuffer str = new StringBuffer("{");

        classFile = obj.getClass();
        System.out.println(classFile);
        fieldArray = classFile.getDeclaredFields();

        try {
            for (int i = 0; i < fieldArray.length; i++) {
                Field field = fieldArray[i];
                field.setAccessible(true);
                String fieldName = field.getName();
                Object value = field.get(obj);
                str.append("\"");
                str.append(fieldName);
                str.append("\":");
                str.append("\"");
                str.append(value);
                str.append("\"");
                if (i < fieldArray.length - 1) {
                    str.append(",");
                }
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } finally {
            str.append("}");

        }
        return str.toString();
    }
}
