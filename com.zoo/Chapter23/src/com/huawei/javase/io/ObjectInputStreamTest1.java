package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/**
 * �����л�
 */
public class ObjectInputStreamTest1 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("students"));
        // ��ʼ�����л�����
        Object obj = ois.readObject();
        // �����л�������һ��ѧ���������Ի����ѧ�������toString����
        System.out.println(obj);
        ois.close();
    }
}
