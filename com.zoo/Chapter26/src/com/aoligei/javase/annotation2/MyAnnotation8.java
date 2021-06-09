package com.aoligei.javase.annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//只允许该注解可以标注类、方法
// @Target(value = {ElementType.TYPE, ElementType.METHOD})
// ElementType.TYPE指类
@Target({ElementType.TYPE, ElementType.METHOD})
// 希望这个注解可以被反射
// @Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
// RetentionPolicy.SOURCE表示只存在java的源文件中，生成的class的文件中没有注解，就不能被反射。
// RetentionPolicy.CLASS表示保存到class文件中
// RetentionPolicy.RUNTIME表示既保存到class文件中，也可以被反射机制读取
public @interface MyAnnotation8 {
    /**
    value属性
     */
    String value() default "重庆南岸区";
}
