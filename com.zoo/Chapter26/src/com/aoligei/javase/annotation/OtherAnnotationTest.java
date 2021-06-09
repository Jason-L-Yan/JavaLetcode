package com.aoligei.javase.annotation;

public class OtherAnnotationTest {

    public static void main(String[] args) {
        OtherAnnotationTest oa = new OtherAnnotationTest();
        oa.doOther();
        oa.doSome();
    }
    
    // 数组是大括号
    @OtherAnnotation(age = 25, emil = {"zhangsan@163.com", "wanger@qq.com"}, seasonArray = {Season.SPRINT, Season.WINTER})
    public void doSome() {
        System.out.println("doSome 运行！");
    }

    // 如果数组中只有1个元素：大括号可以省略。
    @OtherAnnotation(age = 18, emil = "HapppyInfinite@163.com", seasonArray = Season.ANTUMN)
    public void doOther() {
        System.out.println("doOther 运行！");
    }
}
