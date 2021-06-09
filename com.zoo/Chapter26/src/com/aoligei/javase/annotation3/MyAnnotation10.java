package com.aoligei.javase.annotation3;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface MyAnnotation10 {
    /*
    username Ù–‘
     */
    String userName();

    /*
    password Ù–‘
     */
    String password();
}
