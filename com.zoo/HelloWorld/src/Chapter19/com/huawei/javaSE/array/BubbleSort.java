/**
 * ð������
 */
package com.huawei.javaSE.array;

public class BubbleSort {
    public static void main(String[] args) {
        // int[] arr = { 9, 3, 2, 7, 6, 8, 100, 4, 86, 36, 0};
        int[] arr = { 9, 8, 10, 7, 6, 0, 11 };
        int count = 0;
        int count2 = 0;
        for (int j = 0; j < arr.length - 1; j++)
            for (int i = 0; i < arr.length - 1 - j; i++) { // arr.length - 1 ��ֹ����i + 1 Խ��
                count++;
                if (arr[i] > arr[i + 1]) {
                    int flag;
                    count2++;
                    flag = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = flag;
                }
            }
        System.out.println("�Ƚϴ�����" + count);
        System.out.println("����������" + count2);
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
