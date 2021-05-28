package com.huawei.javase.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;

/*
java.io.DataOutputStream������ר��������
��������Խ�������ͬ���ݵ�����һ��д���ļ���
ע�⣺����ļ�������ͨ�ı��ĵ���������ļ�ʹ�ü��±��򲻿�����
 */
public class DataOutputStreamTest {
    public static void main(String[] args) throws Exception{
        // ��������ר�����ֽ������
        DataOutputStream dos = new DataOutputStream(new FileOutputStream("data"));
        // д����
        byte b = 100;
        short s = 200;
        int i = 300;
        long l = 400L;
        float f = 3.0F;
        double d = 3.14;
        boolean sex = false;
        char c = 'a';
        
        dos.writeByte(b); // �������Լ����ݵ�����һ��д�뵽�ļ����С�
        dos.writeShort(s);
        dos.writeInt(i);
        dos.writeLong(l);
        dos.writeFloat(f);
        dos.writeDouble(d);
        dos.writeBoolean(sex);
        dos.writeChar(c);
        // ˢ��
        dos.flush();
        // �ر������
        dos.close();
    }
}
