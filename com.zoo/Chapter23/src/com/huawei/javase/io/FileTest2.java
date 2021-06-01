package com.huawei.javase.io;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest2 {
    public static void main(String[] args) {
        File f1 = new File("D:\\GitHub\\Java\\com.zoo\\Chapter23\\��һ�������");
         // ��ȡ�ļ���
         System.out.println("�ļ�����" + f1.getName());  // �ļ�������һ�������
 
        // �ж��Ƿ���һ��Ŀ¼
        System.out.println(f1.isDirectory());  // false
        // �ж��Ƿ���һ���ļ�
        System.out.println(f1.isFile()); // true
        // ��ȡ�ļ����һ���޸�ʱ��
        long haoMiao = f1.lastModified(); // ��������Ǵ�1970�굽���ڵ��ܺ�������
        Date time = new Date(haoMiao);  // �вι�����
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
        String strTime = date.format(time);
        // 2021-05-28 15:25:57 986
        System.out.println(strTime);

        // ��ȡ�ļ���С
        System.out.println(f1.length());  // 251�ֽ�
    }
}
