package com.huawei.javaSE.array;

// 当一个方法的参数是一个数组的时候，我们还可以采用这种方式传。
public class ArrayTest4 {
    public static void main(String[] args) {
        int[] a = { 1, 2, 3 };
        printArray(a);

        System.out.println("==================================");
        int[] a2 = new int[4];
        printArray(a2);

        System.out.println("==================================");
        printArray(new int[3]);
        
        System.out.println("==================================");
        printArray(new int[]{1, 2, 3});
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

    }

}
