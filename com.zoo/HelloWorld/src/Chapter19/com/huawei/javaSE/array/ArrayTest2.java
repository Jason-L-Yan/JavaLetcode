/*
����ÿ�����͵�Ĭ��ֵ����ӡ����
    ��������            Ĭ��ֵ
    ----------------------------
    byte                0
    short               0
    int                 0
    long                0L
    float               0.0F
    double              0.0
    boolean             false
    char                \u0000
    ������������          null

 ʲôʱ����þ�̬��ʼ����ʽ��ʲôʱ��ʹ�ö�̬��ʼ����ʽ�أ�
    ���㴴�������ʱ��ȷ�������д洢��Щ�����Ԫ��ʱ�����þ�̬��ʼ����ʽ��
    ���㴴�������ʱ�򣬲�ȷ�����������д洢��Щ���ݣ�����Բ��ö�̬��ʼ���ķ�ʽ��Ԥ�ȷ����ڴ�ռ䡣
 */
package com.huawei.javaSE.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("�����±�Ϊ" + i + "��Ԫ����" + a[i]);
        }
        
        // ��ʼ��һ��Object���͵����飬���ö�̬��ʼ��
        Object[] obj = new Object[3];  // 3�����ȣ���̬��ʼ��������Ԫ��Ĭ��Ϊnull
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        } 
        
        
        System.out.println("================================");
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println(str[i]);
        } 
        
        System.out.println("================================");
        String[] str2 = new String[]{"abc", "xyz", "edg"};
        for (int i = 0; i < str2.length; i++) {
            System.out.println(str2[i]);
        } 
        
        System.out.println("================================");
        String[] str3 = {"abc", "xyz", "edg", "hjk"};
        for (int i = 0; i < str3.length; i++) {
            System.out.println(str3[i]);
        }  
        
        System.out.println("================================");
        // Object[] objs = {new Object(), new Object(), new Object()};
        // ����
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = new Object();
        Object[] objs = {o1, o2, o3};
        for (int i = 0; i < objs.length; i++) {
            /*Object o = objects[i];
            System.out.println(o);*/
            System.out.println(objs[i]);
        }
    }
}
