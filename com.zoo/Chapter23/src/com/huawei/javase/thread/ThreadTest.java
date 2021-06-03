package com.huawei.javase.thread;

/*
��ҷ������³����м����̣߳������������߳�֮�⡣�м����̣߳�
    1���̡߳�����Ϊ����ֻ��1��ջ����

main begin
m1 begin
m2 begin
m3 execute!
m2 over
m1 over
main over
    һ��ջ�У����϶��µ�˳����������ִ�У�

 */
public class ThreadTest {
    public static void main(String[] args) {
        System.out.println("main begin");
        m1();
        System.out.println("main over");
    }

    private static void m1() {
        System.out.println("m1 begin");
        m2();
        System.out.println("m1 over");
    }

    private static void m2() {
        System.out.println("m2 begin");
        m3();
        System.out.println("m2 over");
    }

    private static void m3() {
        System.out.println("m3 execute!");
    }
}
