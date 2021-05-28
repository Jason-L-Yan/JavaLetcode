package com.huawei.javase.io;

import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/*
BufferedWriter：带有缓冲的字符输出流。
OutputStreamWriter：转换流
 */
public class BufferedWriterTest {
    public static void main(String[] args) throws Exception {

        // BufferedWriter out = new BufferedWriter(new FileWriter("嘚啵嘚啵"));

        // 和转换流合并
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("嘿嘿嘿嘿", true)));
        // 开始写。
        out.write("hello world!");
        out.write("\n");
        out.write("hello kitty!");
        // 刷新
        out.flush();
        // 关闭最外层
        out.close();
    }
}
