package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
�Ե�һ��������иĽ���ѭ����ʽ��

������������ȱ�㣺
    һ�ζ�ȡһ���ֽ�byte�������ڴ��Ӳ�̽���̫Ƶ����������ʱ��/��Դ���ķ�
    �ڽ��������ˡ��ܲ���һ�ζ�ȡ����ֽ��أ����ԡ�
 */
public class FileInputStreamTest2 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        
        try {
            fis = new FileInputStream("C:\\Users\\jason\\Desktop\\Untitled1.txt");
            // ����һ������
            int readData;
            while ((readData = fis.read()) != -1) {
                System.out.println(readData);
            }

            // ��������
            // while (true) {
            //     int readData = fis.read();
            //     if (readData == -1) {
            //         break;
            //     }
            //     System.out.println(readData);
            // }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }    
        }
    }
}
