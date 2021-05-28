package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/*
int read(byte[] b)
    һ������ȡ b.length ���ֽڡ�
    ����Ӳ�̺��ڴ�Ľ�������߳����ִ��Ч�ʡ�
    ��byte[]���鵱�ж���
 */
public class FileInputStreamTest3 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            // ���·���Ļ��أ����·��һ���Ǵӵ�ǰ���ڵ�λ����Ϊ��㿪ʼ�ң�
            // IDEAĬ�ϵĵ�ǰ·�����������Project�ĸ�����IDEA��Ĭ�ϵ�ǰ·����
            fis = new FileInputStream("src\\com\\huawei\\javase\\io\\tempfile.txt");  // abcdAB

            // ��ʼ��������byte���飬һ�ζ�ȡ����ֽڡ�����ȡ������.length�����ֽڡ�
            // ׼��һ��4�����ȵ�byte���飬һ������ȡ4���ֽڡ�
            byte[] bytes = new byte[4];  
            // ��������ķ���ֵ�ǣ���ȡ�����ֽ��������������ֽڱ���
            int readCount = fis.read(bytes);
            System.out.println(readCount);  // ��һ�ζ�����4���ֽڡ�
            // ���ֽ�����ȫ��ת�����ַ���
            System.out.println(new String(bytes)); // abcd
            // ��Ӧ��ȫ����ת����Ӧ���Ƕ�ȡ�˶��ٸ��ֽڣ�ת�����ٸ���
            System.out.println(new String(bytes,0, readCount));

            readCount = fis.read(bytes); // �ڶ���ֻ�ܶ�ȡ��2���ֽڡ�
            System.out.println(readCount); // 2
            // ���ֽ�����ȫ��ת�����ַ���
            // ��Ϊ��ʣ�����ֽڣ������Ǵ���byte[]�����У�ǰ���������ˣ�����Ļ����ϴζ�ȡ������
            // û�и��ǡ�
            System.out.println(new String(bytes)); // ABcd  
            // ��Ӧ��ȫ����ת����Ӧ���Ƕ�ȡ�˶��ٸ��ֽڣ�ת�����ٸ���
            System.out.println(new String(bytes,0, readCount));

            readCount = fis.read(bytes); // 1���ֽڶ�û�ж�ȡ������-1
            System.out.println(readCount); // -1

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
