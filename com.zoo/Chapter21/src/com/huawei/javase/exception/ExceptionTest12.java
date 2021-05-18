package com.huawei.javase.exception;

public class ExceptionTest12 {
    public static void main(String[] args) {
        try {
            System.out.println("try...");
            // 退出JVM
            System.exit(0);  // 退出JVM之后，finally语句中的代码就不执行了！
        } finally {
             // finally中的语句会执行。能执行到。
            System.out.println("finally");
        }
    }
}
