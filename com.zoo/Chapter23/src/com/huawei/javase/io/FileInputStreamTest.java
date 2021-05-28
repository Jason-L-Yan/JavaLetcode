/*
java.io.FileInputStream:
    1、文件字节输入流，万能的，任何类型的文件都可以采用这个流来读。
    2、字节的方式，完成输入的操作，完成读的操作（硬盘---> 内存）
 */
package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// C:\Users\jason\Desktop\Untitled1.txt
public class FileInputStreamTest {
    public static void main(String[] args) {
        // 放在try catch外面，finally中才能够关闭输入流，因为放在try中就变成局部变量。
        FileInputStream fis = null; 
        // 创建文件字节输入流
        // 创建文件字节输入流对象
        // 文件路径：D:\course\JavaProjects\02-JavaSE\temp （IDEA会自动把\编程\\，因为java中\表示转义）
        // 以下都是采用了：绝对路径的方式。
        //FileInputStream fis = new FileInputStream("D:\\course\\JavaProjects\\02-JavaSE\\temp");
        // 写成这个/也是可以的。
        try {
            fis = new FileInputStream("C:\\Users\\jason\\Desktop\\Untitled1.txt");  // ABCdef

            // 开始度
            int readData = fis.read();  // 这个方法的返回值是：读取到的“字节”本身。
            System.out.println(readData);  // 65
            
            readData = fis.read();  
            System.out.println(readData);  // 66

            readData = fis.read();  
            System.out.println(readData);  // 67

            readData = fis.read();  
            System.out.println(readData);  // 100

            readData = fis.read();  
            System.out.println(readData);  // 101

            readData = fis.read();  
            System.out.println(readData);  // 102
            
             // 已经读到文件的末尾了，再读的时候读取不到任何数据，返回-1.
            readData = fis.read();  
            System.out.println(readData);  // -1

            readData = fis.read();  
            System.out.println(readData);  // -1
            
            readData = fis.read();  
            System.out.println(readData);  // -1

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 在finally语句块当中确保流一定关闭。
            if (fis != null) {  // 避免空指针异常！
                // 关闭流的前提是：流不是空。流是null的时候没必要关闭。
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
