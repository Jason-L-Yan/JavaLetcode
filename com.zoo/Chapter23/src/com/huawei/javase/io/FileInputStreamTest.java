/*
java.io.FileInputStream:
    1���ļ��ֽ������������ܵģ��κ����͵��ļ������Բ��������������
    2���ֽڵķ�ʽ���������Ĳ�������ɶ��Ĳ�����Ӳ��---> �ڴ棩
 */
package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// C:\Users\jason\Desktop\Untitled1.txt
public class FileInputStreamTest {
    public static void main(String[] args) {
        // ����try catch���棬finally�в��ܹ��ر�����������Ϊ����try�оͱ�ɾֲ�������
        FileInputStream fis = null; 
        // �����ļ��ֽ�������
        // �����ļ��ֽ�����������
        // �ļ�·����D:\course\JavaProjects\02-JavaSE\temp ��IDEA���Զ���\���\\����Ϊjava��\��ʾת�壩
        // ���¶��ǲ����ˣ�����·���ķ�ʽ��
        //FileInputStream fis = new FileInputStream("D:\\course\\JavaProjects\\02-JavaSE\\temp");
        // д�����/Ҳ�ǿ��Եġ�
        try {
            fis = new FileInputStream("C:\\Users\\jason\\Desktop\\Untitled1.txt");  // ABCdef

            // ��ʼ��
            int readData = fis.read();  // ��������ķ���ֵ�ǣ���ȡ���ġ��ֽڡ�����
            System.out.println(readData);  // 65
            
            readData = fis.read();  
            System.out.println(readData);  // 66

            readData = fis.read();  
            System.out.println(readData);  // 67

            readData = fis.read();  
            System.out.println(readData);  // 100

            readData = fis.read();  
            System.out.println(readData);  // 101

            readData = fis.read();  
            System.out.println(readData);  // 102
            
             // �Ѿ������ļ���ĩβ�ˣ��ٶ���ʱ���ȡ�����κ����ݣ�����-1.
            readData = fis.read();  
            System.out.println(readData);  // -1

            readData = fis.read();  
            System.out.println(readData);  // -1
            
            readData = fis.read();  
            System.out.println(readData);  // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // ��finally���鵱��ȷ����һ���رա�
            if (fis != null) {  // �����ָ���쳣��
                // �ر�����ǰ���ǣ������ǿա�����null��ʱ��û��Ҫ�رա�
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
