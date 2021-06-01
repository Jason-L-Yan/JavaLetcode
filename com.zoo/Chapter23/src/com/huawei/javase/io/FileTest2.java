package com.huawei.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\GitHub\\Java\\com.zoo\\Chapter23\\风一般的男子");
         // 获取文件名
         System.out.println("文件名：" + f1.getName());  // 文件名：风一般的男子
 
        // 判断是否是一个目录
        System.out.println(f1.isDirectory());  // false
        // 判断是否是一个文件
        System.out.println(f1.isFile()); // true
        // 获取文件最后一次修改时间
        long haoMiao = f1.lastModified(); // 这个毫秒是从1970年到现在的总毫秒数。
        Date time = new Date(haoMiao);  // 有参构造器
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = date.format(time);
        // 2021-05-28 15:25:57 986
        System.out.println(strTime);

        // 获取文件大小
        System.out.println(f1.length());  // 251字节
    }
}
