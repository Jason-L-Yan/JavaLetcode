package com.aoligei.javase.reflect;

import java.util.ResourceBundle;

/*
java.util�����ṩ��һ����Դ���������ڻ�ȡ���������ļ��е����ݡ�
ʹ���������ַ�ʽ��ʱ�����������ļ�xxx.properties����ŵ���·���¡�
 */
public class ResourceBundleTest {
    public static void main(String[] args) {
        // ��Դ������ֻ�ܰ�xxx.properties�ļ�����������ļ���������·���¡��ļ���չ��Ҳ������properties
        // ������д·����ʱ��·���������չ������д��
        ResourceBundle bundle = ResourceBundle.getBundle("classinfo2");
        String className = bundle.getString("className");
        System.out.println(className);

        // ResourceBundle bundle = ResourceBundle.getBundle("com/aoligei/javase/bean/classinfo3");
        // String className = bundle.getString("className");
        // System.out.println(className);

        try {
            Class c = Class.forName(className);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
