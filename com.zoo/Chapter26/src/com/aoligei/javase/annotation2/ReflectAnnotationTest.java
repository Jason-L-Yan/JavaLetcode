package com.aoligei.javase.annotation2;

public class ReflectAnnotationTest {

    public static void main(String[] args) throws Exception {
        
        // 获取这个类
        Class c = Class.forName("com.aoligei.javase.annotation2.MyAnnotationTest8");
        // 判断类上面是否有@MyAnnotation
        // isAnnotationPresent中写的是---注解的字节码文件：MyAnnotation8.class
        // System.out.println(c.isAnnotationPresent(MyAnnotation8.class));  // true
        if (c.isAnnotationPresent(MyAnnotation8.class)) {
            // 获取该注解对象
            MyAnnotation8 myAnnotation8 = (MyAnnotation8)c.getAnnotation(MyAnnotation8.class);
            // @com.aoligei.javase.annotation2.MyAnnotation8("\u6c5f\u82cf\u5f90\u5dde")
            // System.out.println("类上面的注解对象" + myAnnotation8);
            // 获取注解对象的属性怎么办？和调接口没区别
            String value = myAnnotation8.value();
            System.out.println(value);
        }

        // 判断String类上是否存在这个注解
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation8.class));  // false
    }
}
