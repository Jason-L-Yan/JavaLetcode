package com.huawei.javase.exception;

public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            // �˳�JVM
            System.exit(0);  // �˳�JVM֮��finally����еĴ���Ͳ�ִ���ˣ�
        } finally {
             // finally�е�����ִ�С���ִ�е���
            System.out.println("finally");
        }
    }
}
