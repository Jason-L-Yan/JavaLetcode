package com.aoligei.javase.reflect;

import java.io.FileReader;
import java.util.Properties;

/*
��֤������Ƶ�����ԡ�
    java����дһ�飬�ٲ��ı�javaԴ����Ļ���֮�ϣ�����������ͬ�����ʵ������
    �ǳ�֮��������OCP����ԭ�򣺶���չ���ţ����޸Ĺرա���

��������Ҫѧϰ���Ǹ߼���ܣ������������У�Ҳ����ʹ�ø߼���ܣ�
������ ssh ssm
    Spring SpringMVC MyBatis
    Spring Struts Hibernate
    ...
    ��Щ�߼���ܵײ�ʵ��ԭ���������˷�����ơ����Է�����ƻ�����Ҫ�ġ�
    ѧ���˷�����������������������ܵײ��Դ���롣
 */
public class ReflectTest3 {
    public static void main(String[] args) throws Exception {
        // ���ַ�ʽ�����д���ˡ�ֻ�ܴ���һ��User���͵Ķ���
        //User user = new User();

        // ���´��������ģ����벻��Ҫ�Ķ��������޸������ļ��������ļ��޸�֮�󣬿��Դ�������ͬ��ʵ������
        // ͨ��IO����ȡclassinfo.properties�ļ�
        FileReader reader = new FileReader("src\\classinfo.properties");
        // �������������Map
        Properties pro = new Properties(); // key value����String
        // ����
        pro.load(reader);
        // �ر���
        reader.close();

        // ͨ��key��ȡvalue
        String className = pro.getProperty("className");
        System.out.println(className);

        // ͨ���������ʵ��������
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        obj.s
    }
}
