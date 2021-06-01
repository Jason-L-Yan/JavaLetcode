package com.huawei.javase.io;

import java.io.File;

/*
File
    1��File����Ĵ����û�й�ϵ������File�಻������ļ��Ķ���д��
    2��File�������ʲô��
        �ļ���Ŀ¼·�����ĳ����ʾ��ʽ��
        C:\Drivers ����һ��File����
        C:\Drivers\Lan\Realtek\Readme.txt Ҳ��File����
        һ��File�����п��ܶ�Ӧ����Ŀ¼��Ҳ�������ļ���
        Fileֻ��һ��·�����ĳ����ʾ��ʽ��
    3����Ҫ����File���г��õķ���
 */
public class FileTest1 {
    public static void main(String[] args) throws Exception {
        // ����һ�� File ����
        // File f1 =new File("C:\\Users\\jason\\Desktop\\�½��ļ��� (2)\\copyfile");
        File f1 =new File("C:\\Users\\jason\\Desktop\\�½��ļ��� (2)\\copyfile888");
        // �ж��ļ��Ƿ����
        System.out.println(f1.exists());

        // ���D:\file�����ڣ������ļ�����ʽ��������
        // if (!f1.exists()) {
        //     // ���ļ�����ʽ������
        //     f1.createNewFile();
        // }

        // ���D:\file�����ڣ�����Ŀ¼����ʽ��������
        // if (!f1.exists()) {
        //     // ��Ŀ¼����ʽ�½���
        //     f1.mkdir();
        // }

        // ���Դ�������Ŀ¼��
        // File f2 =new File("D:/a/b/c/d");
        // if (!f2.exists()) {
        //     // 
        //     f2.mkdirs();  // ע��mkdir������һ�� "s"
        // }

        File f3 = new File("D:/�鼮/�ƺ��� - ������(��ʷ���ձ�).mobi");
        // ��ȡ�ļ��ĸ�·��
        String parentPath = f3.getParent();  // �����ַ���
        System.out.println(parentPath);  // D:\�鼮
        File parentFile = f3.getParentFile();  // ����File
        System.out.println("��ȡ����·����" + parentFile.getAbsolutePath());

        File f4 = new File("��һ�������");
        System.out.println(f4.getAbsolutePath());
    }
}
