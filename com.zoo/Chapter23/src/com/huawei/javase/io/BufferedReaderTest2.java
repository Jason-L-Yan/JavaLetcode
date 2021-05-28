package com.huawei.javase.io;

/*
    new BufferedReader()������췽��ֻ�ܴ�һ���ַ��������ܴ��ֽ�����
    ��ˣ���Ҫת������
    ת������InputStreamReader
 */
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class BufferedReaderTest2 {
    public static void main(String[] args) throws Exception {
        // �ֽ���
        // FileInputStream in = new FileInputStream("src\\App.java");
        // ͨ��ת����ת����InputStreamReader���ֽ���ת�����ַ�������
        // in�ǽڵ�����reader�ǰ�װ����
        // InputStreamReader reader = new InputStreamReader(in);
        // ������췽��ֻ�ܴ�һ���ַ��������ܴ��ֽ�����
        // reader�ǽڵ�����br�ǰ�װ����
        // BufferedReader br = new BufferedReader(reader);
        
        // �ϲ�
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src\\App.java")));
        String line = null;
        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }
        br.close();
    }
}
