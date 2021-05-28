package com.huawei.javase.io;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

/*
��־����
 */
public class Logger {
    /*
    ��¼��־�ķ�����
     */
    public static void log(String msg) {
        // ָ��һ����־�ļ�
        try {
            PrintStream out = new PrintStream(new FileOutputStream("log.txt", true));
            // �ı��������
            System.setOut(out);
            // ���ڵ�ǰʱ��
            Date nowTime = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss SSS");
            String strTime = dateFormat.format(nowTime);
            System.out.println(strTime + ":" + msg);
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
