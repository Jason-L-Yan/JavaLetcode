package com.aoligei.javase.annotation2;

@MyAnnotation8("��������")
public class MyAnnotationTest8 {
    
    // @MyAnnotation8
    // ����The annotation @MyAnnotation8 is disallowed for this location
    int i;

    // @MyAnnotation8  // ���췽��Ҳ����
    public MyAnnotationTest8() {

    }

    @MyAnnotation8
    public static void main(String[] args) {
        // @MyAnnotation8  // ����
        int j;
        System.out.println("���й����ķ�");
    }
}
