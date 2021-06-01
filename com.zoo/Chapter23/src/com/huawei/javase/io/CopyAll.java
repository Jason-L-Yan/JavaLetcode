package com.huawei.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class CopyAll {
    public static void main(String[] args) {
        // 拷贝源
        File srcFile = new File("C:\\Users\\jason\\Desktop\\杂");
        // 拷贝目标
        File destFile = new File("C:\\Users\\jason\\Desktop\\新建文件夹 (3)\\新建文件夹\\新建文件夹");
        // 调用方法拷贝
        copyFile(srcFile, destFile);
    }

    /**
     * 拷贝目录
     * @param srcFile 拷贝源
     * @param destFile 拷贝目标
     */
    private static void copyFile(File srcFile, File destFile) {
        
        

        if (srcFile.isFile()) {  // 递归终止条件
            FileInputStream in = null;
            FileOutputStream out = null;
            
            try {
                in = new FileInputStream(srcFile);
                String path = destFile.getAbsolutePath().endsWith("\\") ? (destFile.getAbsolutePath()) : (destFile.getAbsolutePath() + "\\"+ srcFile.getAbsolutePath().substring(3));

                // ###############################################
                // 第一读取的是文件，但是该文件所在目录没有创建，必须创建该文件
                // 所在的目录
                int index = path.lastIndexOf("\\");
                // System.out.println("位置：" + path.substring(0, index));
                // System.out.println();
                File f2 = new File(path.substring(0, index));
                if (!f2.exists()) {
                    f2.mkdirs();
                }
                // #################################################


                // System.out.println("哈哈：" + path);
                out = new FileOutputStream(path);
                
                // 一边读一边写
                byte[] bytes = new byte[1024*1024];
                int readCount = 0;
                while ((readCount = in.read(bytes)) != -1) {
                    out.write(bytes, 0, readCount);
                }

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
            return;
        }
        File[] files = srcFile.listFiles();
        // System.out.println(files.length);
        for (File file : files) {
            
            // System.out.println(file.getAbsolutePath());
            if (file.isDirectory()) {  // 是不是目录，是的话，先处理目录
                String srcDir = file.getAbsolutePath();
                // C:\Users\jason\Desktop\新建文件夹 (2)\copyfile888
                // System.out.println(srcDir);
                // Users\jason\Desktop\新建文件夹 (2)\copyfile888 
                // 注意把“C:\”取掉，拼接路径
                // System.out.println(srcDir.substring(3));

                // 拼接成新的目录
                String destDir = destFile.getAbsolutePath().endsWith("\\") ? (destFile.getAbsolutePath()) : (destFile.getAbsolutePath() + "\\"+ srcDir.substring(3));
                // System.out.println("dfsdffff:" + destDir);
                // C:\Users\jason\Desktop\审查表和缴费回执单\Users\jason\Desktop\新建文件夹 (2)\copyfile888
                // System.out.println(destDir);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }

            }
            // 递归调用
            copyFile(file, destFile);
        }
    }
}
