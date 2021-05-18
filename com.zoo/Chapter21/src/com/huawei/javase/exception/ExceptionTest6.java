package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/*
异常对象有两个非常重要的方法：

    获取异常简单的描述信息：
        String msg = exception.getMessage();

    打印异常追踪的堆栈信息：
        exception.printStackTrace();
 */
public class ExceptionTest6 {
    public static void main(String[] args) {
        // new FileNotFoundException();新对象时，调用构造器，该构造器没有throws，所以不会有异常。
        FileNotFoundException f = new FileNotFoundException();
        // new FileInputStream() 需要异常处理，因为FileInputStream构造器中存在throws
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
        } catch (FileNotFoundException e1) {
            
            e1.printStackTrace();
        }
        System.out.println("========================================================================");
        // 这里只是为了测试getMessage()方法和printStackTrace()方法。
        // 这里只是new了异常对象，但是没有将异常对象抛出。JVM会认为这是一个普通的java对象。
        NullPointerException e = new NullPointerException("空指针异常HAHAHA");
        String msg = e.getMessage();  // 空指针异常HAHAHA
        System.out.println(msg);
        // 打印异常堆栈信息
        // java后台打印异常堆栈追踪信息的时候，采用了异步线程的方式打印的。
        e.printStackTrace();
        System.out.println("Hello Kitty");
    }
}
