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
import com.huawei.javase.bean.Student;
public class HashMapTest2 {
    public static void main(String[] args) {
        Student s1 = new Student("����");
        Student s2 = new Student("����");
        System.out.println(s1 == s2); 
    }
}
