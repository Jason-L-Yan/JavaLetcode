package com.aoligei.javase.bean;

import java.util.Scanner;

public class ReviewJavaSE {
    /**
     * @author �
     * @param args �������
     * @since 1.0
     * @throws û���쳣
     */
    public static void main(String[] args) {
        // �������Ŀ��������ӿ���̨���������
        System.setProperty("file.encoding", "gbk");
        Scanner input = new Scanner(System.in);
 
        System.out.println("�������ַ�����nextLine����");
        String str1 = input.nextLine();
        System.out.println(str1);
 
        System.out.println("�������ַ�����next����");
        String str = input.next();
        System.out.println(str);

    }
}