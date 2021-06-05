package com.aoligei.javase.reflect;

/*
�ɱ䳤�Ȳ���
    int... args ����ǿɱ䳤�Ȳ���
    �﷨�ǣ�����...  ��ע�⣺һ����3���㡣��

    1���ɱ䳤�Ȳ���Ҫ��Ĳ��������ǣ�0~N����
    2���ɱ䳤�Ȳ����ڲ����б��б��������һ��λ���ϣ����ҿɱ䳤�Ȳ���ֻ����1����
    3���ɱ䳤�Ȳ������Ե���һ������������
 */
public class ArgsTest {
    public static void main(String[] args) {
        m();
        m(10);
        m(10, 20);
        m(10, 20, 30);
        m(10, 20, 30, 40);
        // ��һ��λ�����ַ���������λ�ñ�����int������
        m3("���", 10, 20, 30, 40);
        m4("ab", "de", "kk", "ff");

        String[] strs = {"a","b","c"};
        // Ҳ���Դ�1������
        m4(strs);

        // ֱ�Ӵ�1������
        m4(new String[]{"��","��","��","��", "��"}); //û��Ҫ

        m4("��","��","��","��", "��");
    }

    public static void m(int... args) {
        System.out.println("m����ִ����");
    }

    // ����:ֻ����һ�����ɱ䳤�Ȳ�����������λ�������һ����
    // The variable argument type String of the method m2 must be the last parameter
    // public static void m2(String... args1, int... args2) {

    // }
    
    // ���������ֻ����1����
    public static void m3(String name, int... args) {
        System.out.println("m3����ִ����");
    }

    public static void m4(String... args){
        //args��length���ԣ�˵��args��һ�����飡
        // ���Խ��ɱ䳤�Ȳ�������һ������������
        for(int i = 0; i < args.length; i++){
            System.out.println(args[i]);
        }
    }
}
