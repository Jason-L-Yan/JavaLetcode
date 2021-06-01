package com.huawei.javase.io;

import java.io.Serializable;

public class Student implements Serializable {

    // IDEA�����Զ��������л��汾�š�
    // private static final long serialVersionUID = -7998917368642754840L;

    // Java���������Serializable�ӿ�֮�󣬻��Զ�����һ�����л��汾�š�
    // ����û���ֶ�д������java�������Ĭ���ṩ������л��汾�š�
    // ���齫���л��汾���ֶ���д�������������Զ�����
    private static final long serialVersionUID = 1L; // java�����ʶ��һ�����ʱ����ͨ���������������һ�£���ͨ�����л��汾�š�

    private int no;
    private String name;
    // ���˺ܾã�Student�����Դ����Ķ��ˡ�
    // Դ����Ķ�֮����Ҫ���±��룬����֮��������ȫ�µ��ֽ����ļ���
    // ����class�ļ��ٴ����е�ʱ��java��������ɵ����л��汾��Ҳ�ᷢ����Ӧ�ĸı䡣
    private int age;
    private String email;
    private String address;

    public Student(int no, String name) {
        this.no = no;
        this.name = name;
    }

    public Student() {
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // @Override
    // public String toString() {
    // return "Student [age=" + age + ", name=" + name + ", no=" + no + "]";
    // }

    @Override
    public String toString() {
        return "Student [address=" + address + ", age=" + age + ", email=" + email + ", name=" + name + ", no=" + no
                + "]";
    }

}
