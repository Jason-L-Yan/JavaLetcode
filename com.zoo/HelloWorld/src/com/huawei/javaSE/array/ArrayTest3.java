package com.huawei.javaSE.array;

public class ArrayTest3 {
    // main方法的编写方式，还可以采用C++的语法格式哦
    public static void main(String args[]) {  // String[] args 这是java中的方式。
        int[] x = {1, 2, 3, 4};
        printArray(x);

        String[] str = {"abc", "def", "hehe", "haha"};
        printArray(str);
    }

    // 打印数组元素,重构
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    public static void printArray(String[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
