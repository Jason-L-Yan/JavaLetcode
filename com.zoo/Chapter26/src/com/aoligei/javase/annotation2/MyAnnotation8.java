package com.aoligei.javase.annotation2;

import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

//ֻ�����ע����Ա�ע�ࡢ����
// @Target(value = {ElementType.TYPE, ElementType.METHOD})
// ElementType.TYPEָ��
@Target({ElementType.TYPE, ElementType.METHOD})
// ϣ�����ע����Ա�����
// @Retention(RetentionPolicy.RUNTIME)
@Retention(RetentionPolicy.RUNTIME)
// RetentionPolicy.SOURCE��ʾֻ����java��Դ�ļ��У����ɵ�class���ļ���û��ע�⣬�Ͳ��ܱ����䡣
// RetentionPolicy.CLASS��ʾ���浽class�ļ���
// RetentionPolicy.RUNTIME��ʾ�ȱ��浽class�ļ��У�Ҳ���Ա�������ƶ�ȡ
public @interface MyAnnotation8 {
    /**
    value����
     */
    String value() default "�����ϰ���";
}
