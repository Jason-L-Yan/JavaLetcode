package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
���հ棬��Ҫ���ա�
 */
public class FileInputStreamTest4 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src\\tempfile3");
            byte[] bytes = new byte[4];  // ��ʼ������Ϊ��󣬾�һ�ζ�ȡ���ٸ��ֽڣ������

            /*while(true){
                int readCount = fis.read(bytes);
                if(readCount == -1){
                    break;
                }
                // ��byte����ת�����ַ������������ٸ�ת�����ٸ���
                System.out.print(new String(bytes, 0, readCount));
            }*/

            int readCount = 0;
            while ((readCount = fis.read(bytes)) != -1) {
                System.out.print(new String(bytes, 0, readCount));
            }
            System.out.println();
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
