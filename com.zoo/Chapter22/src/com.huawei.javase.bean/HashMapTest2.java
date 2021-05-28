import java.util.HashSet;
import java.util.Set;

/*
1����Map�����д棬�Լ���Map������ȡ�������ȵ���key��hashCode������Ȼ���ٵ���equals������
equals�����п��ܵ��ã�Ҳ�п��ܲ����á�
    ��put(k,v)������ʲôʱ��equals������ã�
        k.hashCode()�������ع�ϣֵ��
        ��ϣֵ������ϣ�㷨ת���������±ꡣ
        �����±�λ���������null��equals����Ҫִ�С�
    ��get(k)������ʲôʱ��equals������ã�
        k.hashCode()�������ع�ϣֵ��
        ��ϣֵ������ϣ�㷨ת���������±ꡣ
        �����±�λ���������null��equals����Ҫִ�С�

2��ע�⣺���һ�����equals������д�ˣ���ôhashCode()����������д��
����equals�������������true��hashCode()�������ص�ֵ����һ����
    equals��������true��ʾ����������ͬ����ͬһ�����������ϱȽϡ�
    ��ô����ͬһ�����������ϵĽڵ���˵�����ǵĹ�ϣֵ������ͬ�ġ�
    ����hashCode()�����ķ���ֵҲӦ����ͬ��

3��hashCode()������equals()���������о��ˣ�ֱ��ʹ��IDEA�������ɣ�����������������Ҫͬʱ���ɡ�

4���ռ����ۣ�
    ����HashMap����key���ֵģ��Լ�����HashSet�����е�Ԫ�أ���Ҫͬʱ��дhashCode������equals������

5�����ڹ�ϣ�����ݽṹ��˵��
    ���o1��o2��hashֵ��ͬ��һ���Ƿŵ�ͬһ�����������ϡ�
    ��Ȼ���o1��o2��hashֵ��ͬ�������ڹ�ϣ�㷨ִ�н���֮��ת���������±������ͬ����ʱ�ᷢ������ϣ��ײ����

 */
// package com.huawei.javase.bean;
public class HashMapTest2 {    
    public static void main(String[] args) {
        Student2 s1 = new Student2("����");
        Student2 s2 = new Student2("����");
        // false �Ƚ����ߵ�ַ
        System.out.println(s1 == s2); 
        // false û����дequals֮ǰ�Ƚϵ�Ҳ�ǵ�ַ����д֮����true 
        System.out.println(s1.equals(s2)); 

        // 284720968 (��дhashCode֮��-1432604525)��û����д֮ǰ�����ڴ��ַ
        System.out.println("s1��hashCode=" + s1.hashCode()); 
        // 122883338 (��дhashCode֮��-1432604525) 
        System.out.println("s2��hashCode=" + s2.hashCode());  
        // s1.equals(s2)����Ѿ���true�ˣ���ʾs1��s2��һ���ģ���ͬ�ģ���ô��HashSet�����зŵĻ���
        // ��˵ֻ�ܷŽ�ȥ1������HashSet�����ص㣺���򲻿��ظ���
        Set<Student2> stu = new HashSet<>();
        stu.add(s1);
        stu.add(s2);
        // ��������˵Ӧ����1. ���ǽ����2.��Ȼ������HashSet���ϴ洢�ص㡣��ô�죿��дhashCode
        System.out.println(stu.size());  
    }
}
