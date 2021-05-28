package com.huawei.javase.io;

/*
FileWriter:
    文件字符输出流。写。
    只能输出普通文本。
 */
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTest {
    public static void main(String[] args) {
        FileWriter out = null;
        try {
            // 创建文件字符输出流对象
            // out = new FileWriter("file");
            out = new FileWriter("风一般的男子", true);

            // 开始写
            char[] chars = {'我', '是', '中', '国', '人'};
            out.write(chars);
            out.write(chars, 2, 3);
            out.write("我是一名工程师");
            out.write("\n");
            out.write("Hello world.");
            // 刷新
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
