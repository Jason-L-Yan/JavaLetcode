package com.huawei.javase.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
ʹ��FileReader FileWriter���п����Ļ���ֻ�ܿ�������ͨ�ı����ļ���
 */
public class CopyTest2 {
    public static void main(String[] args) {
        FileReader in = null;
        FileWriter out = null;
        
        try {

            // ��
            in = new FileReader("��һ�������");
            // д
            out = new FileWriter("src\\com\\huawei\\javase\\io\\������һ�������");
            char[] chars = new char[1024*512];  // 1M
            int readCount = 0;
            while ((readCount = in.read(chars)) != -1) {
                out.write(chars, 0, readCount);
            }
            // ˢ��
            out.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

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
