package com.aoligei.javase.annotation2;

@MyAnnotation8("江苏徐州")
public class MyAnnotationTest8 {
    
    // @MyAnnotation8
    // 报错：The annotation @MyAnnotation8 is disallowed for this location
    int i;

    // @MyAnnotation8  // 构造方法也不行
    public MyAnnotationTest8() {

    }

    @MyAnnotation8
    public static void main(String[] args) {
        // @MyAnnotation8  // 报错
        int j;
        System.out.println("大中国照四方");
    }
}
