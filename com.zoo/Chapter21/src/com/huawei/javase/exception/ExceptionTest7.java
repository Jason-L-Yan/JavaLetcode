package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionTest7 {
    public static void main(String[] args) {
        try {
            m1();
            System.out.println("Hello Kitty");
        } catch (FileNotFoundException e) {
            // 获取异常的简单描述信息
            String msg = e.getMessage();
            System.out.println(msg); //C:\jetns-agent.jar (系统找不到指定的文件。)
            //打印异常堆栈追踪信息！！！
            //在实际的开发中，建议使用这个。养成好习惯！
            // 这行代码要写上，不然出问题你也不知道！
            e.printStackTrace();
            System.out.println("You!!!!!!!!!!!!!!!");
            /*
            java.io.FileNotFoundException: C:\jetns-agent.jar (系统找不到指定的文件。)
                at java.base/java.io.FileInputStream.open0(Native Method)
                at java.base/java.io.FileInputStream.open(FileInputStream.java:213)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:155)
                at java.base/java.io.FileInputStream.<init>(FileInputStream.java:110)
                at com.bjpowernode.javase.exception.ExceptionTest09.m3(ExceptionTest09.java:31)
                at com.bjpowernode.javase.exception.ExceptionTest09.m2(ExceptionTest09.java:27)
                at com.bjpowernode.javase.exception.ExceptionTest09.m1(ExceptionTest09.java:23)
                at com.bjpowernode.javase.exception.ExceptionTest09.main(ExceptionTest09.java:14)
                因为31行出问题导致了27行
                27行出问题导致23行
                23行出问题导致14行。
                应该先查看31行的代码。31行是代码错误的根源。
             */
        }
        System.out.println("哎呦，不错哦！");
    }

    private static void m1() throws FileNotFoundException {
        m2();
    }

    private static void m2() throws FileNotFoundException {
        m3();
    }

    private static void m3() throws FileNotFoundException {
        new  FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
    }

}
