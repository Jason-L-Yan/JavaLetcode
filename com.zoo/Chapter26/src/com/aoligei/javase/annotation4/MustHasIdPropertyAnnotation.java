package com.aoligei.javase.annotation4;

import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// ��ʾ���ע��ֻ�ܳ�����������
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface MustHasIdPropertyAnnotation {

}
// ���ע��@Id������ע�࣬����ע�����б�����һ��int���͵�id���ԣ�û�оͱ��쳣��
