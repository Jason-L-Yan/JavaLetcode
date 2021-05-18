/*
����try..catch�е�finally�Ӿ䣺
    1����finally�Ӿ��еĴ��������ִ�еģ�������һ����ִ�еģ���ʹtry�����еĴ���������쳣��
        finally�Ӿ�����tryһ����֣����ܵ�����д��

    2��finally���ͨ��ʹ������Щ������أ�
        ͨ����finally�����������Դ���ͷ�/�رա�
        ��Ϊfinally�еĴ���Ƚ��б��ϡ�
        ��ʹtry�����еĴ�������쳣��finally�д���Ҳ������ִ�С�
 */
package com.huawei.javase.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionTest8 {
    public static void main(String[] args) {
        FileInputStream fis = null;   // ����λ�÷ŵ�try���档������finally�в����á�
        try {
            fis = new FileInputStream("D:\\GitHub\\Java\\Testing.java");
            String s = null;
            // ����һ������ֿ�ָ���쳣��
            s.toString();
            System.out.println("ͣ����");
            // ��ʹ������Ҫ�رգ���Ϊ����ռ����Դ�ġ�
            // ��ʹ���ϳ�������쳣����Ҳ����Ҫ�رգ�
            // ���������п������ز��ˡ�
            // fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException e) {
            e.printStackTrace();
        } finally {  
            System.out.println("hello �ƿˣ�");
            // ���Ĺرշ�������Ƚϱ��ա�
            // finally�еĴ�����һ����ִ�еġ�
            // ��ʹtry�г������쳣��
            if (fis != null) {
                try {
                    // close()�������쳣�����ò�׽�ķ�ʽ��
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("hello World");
    }
}
