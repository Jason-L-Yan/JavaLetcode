package com.huawei.javase.io;

/*
FileWriter:
    �ļ��ַ��������д��
    ֻ�������ͨ�ı���
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // �����ļ��ַ����������
            // out = new FileWriter("file");
            out = new FileWriter("��һ�������", true);

            // ��ʼд
            char[] chars = {'��', '��', '��', '��', '��'};
            out.write(chars);
            out.write(chars, 2, 3);
            out.write("����һ������ʦ");
            out.write("\n");
            out.write("Hello world.");
            // ˢ��
            out.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
