package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
深入try..catch
    1、catch后面的小括号中的类型可以是具体的异常类型，也可以是该异常类型的父类型。
    2、catch可以写多个。建议catch的时候，精确的一个一个处理。这样有利于程序的调试。
    3、catch写多个的时候，从上到下，必须遵守从小到大。
 */
public class ExceptionTest5 {
    /*
    public static void main(String[] args) throws Exception, FileNotFoundException, NullPointerException {

    }
     */

    /*public static void main(String[] args) throws Exception {

    }*/

    public static void main(String[] args) {
        // try {
        //     // FileInputStream fis = new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
        //     FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
        //     System.out.println("以上异常，词句不再执行");
        // } catch (FileNotFoundException e) {
            //     // e.printStackTrace();
            //     System.out.println("文件不存在！");
            // }
        // try {
        //     FileInputStream fis = new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
        //     // fis.read();
        // } catch (FileNotFoundException e) {  // 多态：IOException e = new FileNotFoundException();        
        //     // e.printStackTrace();
        //     System.out.println("文件不存在！");
        // } catch (IOException e) {
        //     System.out.println("读文件错误！");
        //     // e.printStackTrace();
        // } 
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\学习方法.txt");
            System.out.println(100 / 0);
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            // e.printStackTrace();
            System.out.println("文件不存在？数学异常？空指针异常？都有可能。");
        }
    }
}
