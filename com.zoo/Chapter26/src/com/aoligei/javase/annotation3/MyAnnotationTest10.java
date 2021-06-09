package com.aoligei.javase.annotation3;

import java.lang.reflect.Method;

public class MyAnnotationTest10 {
    @MyAnnotation10(userName = "amdin", password = "123")
    public void doSome() {
        
    }

    public static void main(String[] args) throws Exception {
        // ��ȡMyAnnotationTest��doSome()���������ע����Ϣ��
        Class c = Class.forName("com.aoligei.javase.annotation3.MyAnnotationTest10");
        Method doSomeMethod = c.getDeclaredMethod("doSome");
        if (doSomeMethod.isAnnotationPresent(MyAnnotation10.class)) {
            MyAnnotation10 myAnnotation10 = doSomeMethod.getAnnotation(MyAnnotation10.class);
            System.out.println(myAnnotation10.userName());
            System.out.println(myAnnotation10.password());
        }
    }
}
