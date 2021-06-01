package com.huawei.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
 
public class CopyAll {
    public static void main(String[] args) {
        // ����Դ
        File srcFile = new File("C:\\Users\\jason\\Desktop\\��");
        // ����Ŀ��
        File destFile = new File("C:\\Users\\jason\\Desktop\\�½��ļ��� (3)\\�½��ļ���\\�½��ļ���");
        // ���÷�������
        copyFile(srcFile, destFile);
    }

    /**
     * ����Ŀ¼
     * @param srcFile ����Դ
     * @param destFile ����Ŀ��
     */
    private static void copyFile(File srcFile, File destFile) {
        
        

        if (srcFile.isFile()) {  // �ݹ���ֹ����
            FileInputStream in = null;
            FileOutputStream out = null;
            
            try {
                in = new FileInputStream(srcFile);
                String path = destFile.getAbsolutePath().endsWith("\\") ? (destFile.getAbsolutePath()) : (destFile.getAbsolutePath() + "\\"+ srcFile.getAbsolutePath().substring(3));

                // ###############################################
                // ��һ��ȡ�����ļ������Ǹ��ļ�����Ŀ¼û�д��������봴�����ļ�
                // ���ڵ�Ŀ¼
                int index = path.lastIndexOf("\\");
                // System.out.println("λ�ã�" + path.substring(0, index));
                // System.out.println();
                File f2 = new File(path.substring(0, index));
                if (!f2.exists()) {
                    f2.mkdirs();
                }
                // #################################################


                // System.out.println("������" + path);
                out = new FileOutputStream(path);
                
                // һ�߶�һ��д
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
            if (file.isDirectory()) {  // �ǲ���Ŀ¼���ǵĻ����ȴ���Ŀ¼
                String srcDir = file.getAbsolutePath();
                // C:\Users\jason\Desktop\�½��ļ��� (2)\copyfile888
                // System.out.println(srcDir);
                // Users\jason\Desktop\�½��ļ��� (2)\copyfile888 
                // ע��ѡ�C:\��ȡ����ƴ��·��
                // System.out.println(srcDir.substring(3));

                // ƴ�ӳ��µ�Ŀ¼
                String destDir = destFile.getAbsolutePath().endsWith("\\") ? (destFile.getAbsolutePath()) : (destFile.getAbsolutePath() + "\\"+ srcDir.substring(3));
                // System.out.println("dfsdffff:" + destDir);
                // C:\Users\jason\Desktop\����ͽɷѻ�ִ��\Users\jason\Desktop\�½��ļ��� (2)\copyfile888
                // System.out.println(destDir);
                File newFile = new File(destDir);
                if (!newFile.exists()) {
                    newFile.mkdirs();
                }

            }
            // �ݹ����
            copyFile(file, destFile);
        }
    }
}
