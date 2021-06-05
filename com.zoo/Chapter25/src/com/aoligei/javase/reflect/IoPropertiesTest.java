package com.aoligei.javase.reflect;

import java.io.InputStream;
import java.util.Properties;

// ��ȡһ���ļ��ľ���·���ˣ���������
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        FileReader reader = new FileReader(path);*/

        // ֱ����������ʽ���ء�
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        // ����һ��
        // String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        // FileReader reader = new FileReader(path);
        // ��������
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
       
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        // ͨ��key��ȡvalue
        String className = pro.getProperty("className");
        System.out.println(className);
        Class c = Class.forName(className);  // ��̬��������
        System.out.println("c�����ͣ�" + c);
        Object obj = c.newInstance();  // �޲ι���������
        // if (obj instanceof com.aoligei.javase.bean.User) {
        //     com.aoligei.javase.bean.User d = (com.aoligei.javase.bean.User) obj;
        //     d.sun();
        // }
        
        // System.out.println(obj instanceof (com.aoligei.javase.bean.User));
    }
}
