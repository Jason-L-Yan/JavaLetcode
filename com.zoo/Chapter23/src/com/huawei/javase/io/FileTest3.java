package com.huawei.javase.io;

import java.io.File;

/*
File中的listFiles方法。
 */
public class FileTest3 {
    // File[] listFiles()
    // 获取当前目录下所有的子文件。
    public static void main(String[] args) {
        File f1 =new File("D:\\GitHub\\Java\\com.zoo");
        File[] files = f1.listFiles();
        for (File f : files) {
            System.out.println(f);
        }
        // D:\GitHub\Java\com.zoo\.vscode
        // D:\GitHub\Java\com.zoo\Chapter21
        // D:\GitHub\Java\com.zoo\Chapter22
        // D:\GitHub\Java\com.zoo\Chapter23
        // D:\GitHub\Java\com.zoo\HelloWorld
    }
}
