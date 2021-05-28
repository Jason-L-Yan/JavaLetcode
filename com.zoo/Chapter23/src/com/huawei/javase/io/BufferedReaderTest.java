package com.huawei.javase.io;

import java.io.BufferedReader;
import java.io.FileReader;

/*
BufferedReader:
    带有缓冲区的字符输入流。
    使用这个流的时候不需要自定义char数组，或者说不需要自定义byte数组。自带缓冲。
 */
public class BufferedReaderTest {
    // 为了方便，这里抛出所有异常。程序可正常运行。正是写程序的时候不能这样操作。
    public static void main(String[] args) throws Exception {  
        
        FileReader fileReader = new FileReader("src\\App.java");

        // 当一个流的构造方法中需要一个流的时候，这个被传进来的流叫做：节点流。
        // 外部负责包装的这个流，叫做：包装流，还有一个名字叫做：处理流。
        // 像当前这个程序来说：FileReader就是一个节点流。BufferedReader就是包装流/处理流。
        BufferedReader br = new BufferedReader(fileReader);
        // // 读第一行
        // System.out.println(br.readLine());
        // // 读第二行
        // System.out.println(br.readLine());
        // // 读第三行
        // System.out.println(br.readLine());

        // br.readLine()方法读取一个文本行，但不带换行符。
        String s = null;
        while ((s = br.readLine()) != null) {
            System.out.println(s);
        }

        // 关闭流，仅需关闭最外面一个即可
        // 关闭流
        // 对于包装流来说，只需要关闭最外层流就行，里面的节点流会自动关闭。（可以看源代码。）
        br.close();
    }
}
