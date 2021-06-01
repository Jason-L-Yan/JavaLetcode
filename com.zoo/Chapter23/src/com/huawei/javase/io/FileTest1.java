package com.huawei.javase.io;

import java.io.File;

/*
File
    1、File类和四大家族没有关系，所以File类不能完成文件的读和写。
    2、File对象代表什么？
        文件和目录路径名的抽象表示形式。
        C:\Drivers 这是一个File对象
        C:\Drivers\Lan\Realtek\Readme.txt 也是File对象。
        一个File对象有可能对应的是目录，也可能是文件。
        File只是一个路径名的抽象表示形式。
    3、需要掌握File类中常用的方法
 */
public class FileTest1 {
    public static void main(String[] args) throws Exception {
        // 创建一个 File 对象
        // File f1 =new File("C:\\Users\\jason\\Desktop\\新建文件夹 (2)\\copyfile");
        File f1 =new File("C:\\Users\\jason\\Desktop\\新建文件夹 (2)\\copyfile888");
        // 判断文件是否存在
        System.out.println(f1.exists());

        // 如果D:\file不存在，则以文件的形式创建出来
        // if (!f1.exists()) {
        //     // 以文件的形式创建。
        //     f1.createNewFile();
        // }

        // 如果D:\file不存在，则以目录的形式创建出来
        // if (!f1.exists()) {
        //     // 以目录的形式新建。
        //     f1.mkdir();
        // }

        // 可以创建多重目录吗？
        // File f2 =new File("D:/a/b/c/d");
        // if (!f2.exists()) {
        //     // 
        //     f2.mkdirs();  // 注意mkdir后多加了一个 "s"
        // }

        File f3 = new File("D:/书籍/唐浩明 - 曾国藩(文史对照本).mobi");
        // 获取文件的父路径
        String parentPath = f3.getParent();  // 返回字符串
        System.out.println(parentPath);  // D:\书籍
        File parentFile = f3.getParentFile();  // 返回File
        System.out.println("获取绝对路径：" + parentFile.getAbsolutePath());

        File f4 = new File("风一般的男子");
        System.out.println(f4.getAbsolutePath());
    }
}
