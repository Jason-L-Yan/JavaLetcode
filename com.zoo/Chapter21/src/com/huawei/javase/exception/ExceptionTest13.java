package com.huawei.javase.exception;

public class ExceptionTest13 {
    public static void main(String[] args) {
        int value = m();
        System.out.println(value);  // 100
    }
     /*
    java�﷨������һЩ�����ǲ����ƻ��ģ�һ����ô˵�ˣ��ͱ�����ô��������
        java����һ�������Ĺ���
            �������еĴ��������ѭ���϶���˳����������ִ�У�ب�Ų�����﷨����
        java�к���һ���﷨����
            return���һ��ִ�У������������������ب�Ų�����﷨����
     */
    public static int m() {
        int i = 100;
        try{
            // ���д��������int i = 100;�����棬�������ս�������Ƿ���100
            // return��仹���뱣֤�����ִ�еġ�һ��ִ�У���������������
            return i;
        } finally {
            i++; 
            // System.out.println("�ϲ���");   
        }
    }
}

/*
������֮���Ч��
public static int m(){
    int i = 100;
    int j = i;
    i++;
    return j;
}
 */