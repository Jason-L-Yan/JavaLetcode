package com.aoligei.javase.reflect;

import java.io.InputStream;
import java.util.Properties;

// 获取一个文件的绝对路径了！！！！！
        /*String path = Thread.currentThread().getContextClassLoader()
                .getResource("classinfo2.properties").getPath();
        FileReader reader = new FileReader(path);*/

        // 直接以流的形式返回。
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception{
        // 方法一：
        // String path = Thread.currentThread().getContextClassLoader().getResource("classinfo.properties").getPath();
        // FileReader reader = new FileReader(path);
        // 方法二：
        InputStream reader = Thread.currentThread().getContextClassLoader().getResourceAsStream("classinfo.properties");
       
        Properties pro = new Properties();
        pro.load(reader);
        reader.close();
        // 通过key获取value
        String className = pro.getProperty("className");
        System.out.println(className);
        Class c = Class.forName(className);  // 静态方法运行
        System.out.println("c的类型：" + c);
        Object obj = c.newInstance();  // 无参构造器运行
        // if (obj instanceof com.aoligei.javase.bean.User) {
        //     com.aoligei.javase.bean.User d = (com.aoligei.javase.bean.User) obj;
        //     d.sun();
        // }
        
        // System.out.println(obj instanceof (com.aoligei.javase.bean.User));
    }
}
