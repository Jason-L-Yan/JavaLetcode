package com.huawei.javase.io;

import java.io.DataInputStream;
import java.io.FileInputStream;

/*
DataInputStream:�����ֽ���������
DataOutputStreamд���ļ���ֻ��ʹ��DataInputStreamȥ�������Ҷ���ʱ������Ҫ��ǰ֪��д���˳��
����˳����Ҫ��д��˳��һ�¡��ſ�������ȡ�����ݡ�

 */
public class DataInputStreamTest {
    public static void main(String[] args) throws Exception {
        DataInputStream dis = new DataInputStream(new FileInputStream("data"));

        // ��ʼ��
        byte b = dis.readByte();
        short s = dis.readShort();
        int i = dis.readInt();
        long l = dis.readLong();
        float f = dis.readFloat();
        double d = dis.readDouble();
        boolean sex = dis.readBoolean();
        char c = dis.readChar();

        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(sex);
        System.out.println(c);

        dis.close();

    }
}
