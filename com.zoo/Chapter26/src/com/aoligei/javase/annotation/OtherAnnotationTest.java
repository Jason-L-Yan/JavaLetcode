package com.aoligei.javase.annotation;

public class OtherAnnotationTest {

    public static void main(String[] args) {
        OtherAnnotationTest oa = new OtherAnnotationTest();
        oa.doOther();
        oa.doSome();
    }
    
    // �����Ǵ�����
    @OtherAnnotation(age = 25, emil = {"zhangsan@163.com", "wanger@qq.com"}, seasonArray = {Season.SPRINT, Season.WINTER})
    public void doSome() {
        System.out.println("doSome ���У�");
    }

    // ���������ֻ��1��Ԫ�أ������ſ���ʡ�ԡ�
    @OtherAnnotation(age = 18, emil = "HapppyInfinite@163.com", seasonArray = Season.ANTUMN)
    public void doOther() {
        System.out.println("doOther ���У�");
    }
}
