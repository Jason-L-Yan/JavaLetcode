package com.huawei.javaSE.array;

public class ArrayTest3 {
    // main�����ı�д��ʽ�������Բ���C++���﷨��ʽŶ
    public static void main(String args[]) {  // String[] args ����java�еķ�ʽ��
        int[] x = {1, 2, 3, 4};
        printArray(x);

        String[] str = {"abc", "def", "hehe", "haha"};
        printArray(str);
    }

    // ��ӡ����Ԫ��,�ع�
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
