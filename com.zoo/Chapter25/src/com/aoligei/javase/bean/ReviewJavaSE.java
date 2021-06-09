package com.aoligei.javase.bean;

import java.util.Scanner;

public class ReviewJavaSE {
    /**
     * @author 李敖
     * @param args 命令参数
     * @since 1.0
     * @throws 没有异常
     */
    public static void main(String[] args) {
        // 控制中文可以正常从控制台输入输出。
        System.setProperty("file.encoding", "gbk");
        Scanner input = new Scanner(System.in);
 
        System.out.println("请输入字符串（nextLine）：");
        String str1 = input.nextLine();
        System.out.println(str1);
 
        System.out.println("请输入字符串（next）：");
        String str = input.next();
        System.out.println(str);

    }
}