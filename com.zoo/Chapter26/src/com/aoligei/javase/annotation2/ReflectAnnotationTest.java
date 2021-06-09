package com.aoligei.javase.annotation2;

public class ReflectAnnotationTest {

    public static void main(String[] args) throws Exception {
        
        // ��ȡ�����
        Class c = Class.forName("com.aoligei.javase.annotation2.MyAnnotationTest8");
        // �ж��������Ƿ���@MyAnnotation
        // isAnnotationPresent��д����---ע����ֽ����ļ���MyAnnotation8.class
        // System.out.println(c.isAnnotationPresent(MyAnnotation8.class));  // true
        if (c.isAnnotationPresent(MyAnnotation8.class)) {
            // ��ȡ��ע�����
            MyAnnotation8 myAnnotation8 = (MyAnnotation8)c.getAnnotation(MyAnnotation8.class);
            // @com.aoligei.javase.annotation2.MyAnnotation8("\u6c5f\u82cf\u5f90\u5dde")
            // System.out.println("�������ע�����" + myAnnotation8);
            // ��ȡע������������ô�죿�͵��ӿ�û����
            String value = myAnnotation8.value();
            System.out.println(value);
        }

        // �ж�String�����Ƿ�������ע��
        Class stringClass = Class.forName("java.lang.String");
        System.out.println(stringClass.isAnnotationPresent(MyAnnotation8.class));  // false
    }
}
