package com.aoligei.javase.annotation;

// ��ʾ������ѹ�ʱ��
@Deprecated
public class AnnotationTest03 {

    @Deprecated
    private String s;

    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();
    }

    @Deprecated
    public void doSome(){
        System.out.println("do something!");
    }

    // Deprecated���ע���ע��Ԫ���ѹ�ʱ��
    // ���ע����Ҫ������������Ա����һ����Ϣ����֪�ѹ�ʱ���и��õĽ���������ڡ�
    @Deprecated
    public static void doOther(){
        System.out.println("do other...");
    }
}

class T {
    public static void main(String[] args) {
        AnnotationTest03 at = new AnnotationTest03();
        at.doSome();

        AnnotationTest03.doOther();

        try {
            Class c = Class.forName("java.util.Date");
            Object obj = c.newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
