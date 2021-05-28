package com.huawei.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
BufferedWriter�����л�����ַ��������
OutputStreamWriter��ת����
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {

        // BufferedWriter out = new BufferedWriter(new FileWriter("�NࣇN�"));

        // ��ת�����ϲ�
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("�ٺٺٺ�", true)));
        // ��ʼд��
        out.write("hello world!");
        out.write("\n");
        out.write("hello kitty!");
        // ˢ��
        out.flush();
        // �ر������
        out.close();
    }
}
