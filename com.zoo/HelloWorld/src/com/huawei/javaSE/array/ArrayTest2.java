/*
关于每个类型的默认值还有印象吗？
    数据类型            默认值
    ----------------------------
    byte                0
    short               0
    int                 0
    long                0L
    float               0.0F
    double              0.0
    boolean             false
    char                \u0000
    引用数据类型          null

 什么时候采用静态初始化方式，什么时候使用动态初始化方式呢？
    当你创建数组的时候，确定数组中存储哪些具体的元素时，采用静态初始化方式。
    当你创建数组的时候，不确定将来数组中存储哪些数据，你可以采用动态初始化的方式，预先分配内存空间。
 */
package com.huawei.javaSE.array;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] a = new int[4];
        for (int i = 0; i < a.length; i++) {
            System.out.println("数组下标为" + i + "的元素是" + a[i]);
        }
        
        // 初始化一个Object类型的数组，采用动态初始化
        Object[] obj = new Object[3];  // 3个长度，动态初始化，所有元素默认为null
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
        // 或者
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
