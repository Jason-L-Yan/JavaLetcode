package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
����try..catch
    1��catch�����С�����е����Ϳ����Ǿ�����쳣���ͣ�Ҳ�����Ǹ��쳣���͵ĸ����͡�
    2��catch����д���������catch��ʱ�򣬾�ȷ��һ��һ���������������ڳ���ĵ��ԡ�
    3��catchд�����ʱ�򣬴��ϵ��£��������ش�С����
 */
public class ExceptionTest5 {
    /*
    public static void main(String[] args) throws Exception, FileNotFoundException, NullPointerException {

    }
     */

    /*public static void main(String[] args) throws Exception {

    }*/

    public static void main(String[] args) {
        // try {
        //     // FileInputStream fis = new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
        //     FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
        //     System.out.println("�����쳣���ʾ䲻��ִ��");
        // } catch (FileNotFoundException e) {
            //     // e.printStackTrace();
            //     System.out.println("�ļ������ڣ�");
            // }
        // try {
        //     FileInputStream fis = new FileInputStream("D:\\GitHub\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
        //     // fis.read();
        // } catch (FileNotFoundException e) {  // ��̬��IOException e = new FileNotFoundException();        
        //     // e.printStackTrace();
        //     System.out.println("�ļ������ڣ�");
        // } catch (IOException e) {
        //     System.out.println("���ļ�����");
        //     // e.printStackTrace();
        // } 
        try {
            FileInputStream fis = new FileInputStream("D:\\Java\\com.zoo\\Chapter21\\out\\src\\com\\huawei\\javase\\exception\\test\\ѧϰ����.txt");
            System.out.println(100 / 0);
        } catch (FileNotFoundException | ArithmeticException | NullPointerException e) {
            // e.printStackTrace();
            System.out.println("�ļ������ڣ���ѧ�쳣����ָ���쳣�����п��ܡ�");
        }
    }
}
