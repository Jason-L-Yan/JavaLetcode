package com.huawei.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
FileReader��
    �ļ��ַ���������ֻ�ܶ�ȡ��ͨ�ı���
    ��ȡ�ı�����ʱ���ȽϷ��㣬��ݡ�
 */
public class FileReaderTest {
    public static void main(String[] args) {
        FileReader reader = null;
        try {
             // �����ļ��ַ�������
            reader = new FileReader("D:\\GitHub\\Java\\com.zoo\\Chapter23\\src\\tempfile3");
            
            //׼��һ��char����
            char[] chars = new char[4];
            // ��char�����ж�
            reader.read(chars); // �����ַ��ķ�ʽ��ȡ����һ��e���ڶ���f�������� ��....
            for(char c : chars) {
                System.out.println(c);
            }
            
            // ��ʼ��
            // char[] chars = new char[4];
            // int readCount = 0;
            // while ((readCount = reader.read(chars)) != -1) {
            //     System.out.print(new String(chars, 0, readCount));
            // }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }    
        }
    }
}
