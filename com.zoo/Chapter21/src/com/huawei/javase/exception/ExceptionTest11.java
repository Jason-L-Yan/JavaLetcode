/*
finally��䣺
    ����finally�����еĴ�����һ����ִ�еġ��ٴ�ǿ����������
 */
package com.huawei.javase.exception;

public class ExceptionTest11 {
    public static void main(String[] args) {
        /*
        try��finally��û��catch�����𣿿��ԡ�
            try���ܵ���ʹ�á�
            try finally��������ʹ�á�
        ���´����ִ��˳��
            ��ִ��try...
            ��ִ��finally...
            ���ִ�� return ��return���ֻҪִ�з�����Ȼ��������
         */
        try {
            System.out.println("try...");
            return;
        } finally {
             // finally�е�����ִ�С���ִ�е���
            System.out.println("finally");
        }
        // ���ﲻ��д��䣬��Ϊ����������޷�ִ�е��ġ�
        // System.out.println("Hello World!");
    }
}
