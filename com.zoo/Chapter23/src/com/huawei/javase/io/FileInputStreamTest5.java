package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
FileInputStream����������÷�����
    int available()������������ʣ���û�ж������ֽ�����
    long skip(long n)�����������ֽڲ�����
 */
public class FileInputStreamTest5 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            
            fis = new FileInputStream("src\\com\\huawei\\javase\\io\\tempfile.txt");  // abcdAB
            // ��1���ֽ�
            int readByte = fis.read();
            System.out.println(readByte);  // 97
            // ��ʣ�¿��Զ����ֽ������ǣ�5
            System.out.println("ʣ�¶��ٸ��ֽ�û�ж���" + fis.available());  // 5
            // ���������ʲô�ã�
            // byte[] bytes = new byte[fis.available()]; // ���ַ�ʽ��̫�ʺ�̫����ļ�����Ϊbyte[]���鲻��̫��
            // ����Ҫѭ���ˡ�
            // ֱ�Ӷ�һ�ξ����ˡ�
            //int readCount = fis.read(bytes); // 6
            //System.out.println(new String(bytes)); // abcdef

            // skip���������ֽڲ���ȡ���������Ҳ�����Ժ���ã�
            fis.skip(3);  // ����3��
            System.out.println(fis.read());

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
