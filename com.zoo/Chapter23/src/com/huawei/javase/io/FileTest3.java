package com.huawei.javase.io;

import java.io.File;

/*
File�е�listFiles������
 */
public class FileTest3 {
    // File[] listFiles()
    // ��ȡ��ǰĿ¼�����е����ļ���
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
