package com.huawei.javaSE.array;

import java.util.Arrays;

public class ArraysUtilTest1 {

    public static void main(String[] args) {
        int[] array = { 1, 5, 4, 98, 55, 23, 698, 84, 3, 2, 5, 98, 6545, 2, 3, 452, 6685 };
        Arrays.sort(array);
        printArray(array);
        System.out.println(Arrays.binarySearch(array, 84));
    }

    // 输出数组
    public static void printArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            // 防止最后一个数字多输出一个空格。
            System.out.print(i != arr.length - 1 ? arr[i] + " " : arr[i]);
        }
        System.out.println();
    }

}
