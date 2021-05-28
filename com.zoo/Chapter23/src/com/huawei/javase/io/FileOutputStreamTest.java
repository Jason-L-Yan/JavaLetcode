package com.huawei.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * �ļ��ֽ������������д��
 * ���ڴ浽Ӳ�̡�
 */
public class FileOutputStreamTest {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            // myfile�ļ������ڵ�ʱ����Զ��½���
            // ���ַ�ʽ����ʹ�ã����ַ�ʽ���Ƚ�ԭ�ļ���գ�Ȼ������д�롣
            //fos = new FileOutputStream("myfile");
            // fos = new FileOutputStream("src/com/huawei/javase/io/myfile");
            
            // ��׷�ӵķ�ʽ���ļ�ĩβд�롣�������ԭ�ļ����ݡ�
            fos = new FileOutputStream("src/com/huawei/javase/io/myfile", true);
            // ��ʼд��
            byte[] bytes = {97, 98, 99, 100};
            // ��byte����ȫ��д����
            fos.write(bytes);
            // ��byte�����һ����д����
            fos.write(bytes, 0, 2); // ��д��ab

            // �ַ���
            String s = "����һ���й��ˣ��ҽ���������";
            // ���ַ���ת����byte���顣
            byte[] bs = s.getBytes();
            // д
            fos.write(bs);

            // д��֮�����һ��Ҫˢ��
            fos.flush();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }    
        }
    }
}
