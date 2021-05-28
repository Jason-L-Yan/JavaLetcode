package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
ʹ��FileInputStream + FileOutputStream����ļ��Ŀ�����
�����Ĺ���Ӧ����һ�߶���һ��д��
ʹ�����ϵ��ֽ��������ļ���ʱ���ļ��������⣬���ܵġ�ʲô�����ļ����ܿ�����
 */
public class CopyTest {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        
        try {
            // ����һ������������
            fis = new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter23\\src\\tempfile3");
            // ����һ�����������
            fos = new FileOutputStream("C:\\Users\\jason\\Desktop\\�½��ļ��� (2)\\copyfile");  // ���ļ�����Ϊcopyfile

            // ����ĵģ�һ�߶���һ��д
            byte[] bytes = new byte[1024 * 1024]; // 1MB��һ����࿽��1MB����
            int readCount = 0;
            while((readCount = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, readCount);
            }
            // ˢ�£���������Ҫˢ��
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ֿ�try����Ҫһ��try��
            // һ��try��ʱ������һ�������쳣�����ܻ�Ӱ�쵽��һ�����Ĺرա�
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
