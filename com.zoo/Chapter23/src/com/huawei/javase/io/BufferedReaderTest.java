package com.huawei.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
BufferedReader:
    ���л��������ַ���������
    ʹ���������ʱ����Ҫ�Զ���char���飬����˵����Ҫ�Զ���byte���顣�Դ����塣
 */
public class BufferedReaderTest {
    // Ϊ�˷��㣬�����׳������쳣��������������С�����д�����ʱ��������������
    public static void main(String[] args) throws Exception {  
        
        FileReader fileReader = new FileReader("src\\App.java");

        // ��һ�����Ĺ��췽������Ҫһ������ʱ������������������������ڵ�����
        // �ⲿ�����װ�����������������װ��������һ�����ֽ�������������
        // ��ǰ���������˵��FileReader����һ���ڵ�����BufferedReader���ǰ�װ��/��������
        BufferedReader br = new BufferedReader(fileReader);
        // // ����һ��
        // System.out.println(br.readLine());
        // // ���ڶ���
        // System.out.println(br.readLine());
        // // ��������
        // System.out.println(br.readLine());

        // br.readLine()������ȡһ���ı��У����������з���
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        // �ر���������ر�������һ������
        // �ر���
        // ���ڰ�װ����˵��ֻ��Ҫ�ر�����������У�����Ľڵ������Զ��رա������Կ�Դ���롣��
        br.close();
    }
}
