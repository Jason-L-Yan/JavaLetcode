package com.aoligei.javase.bean;

public class User {
    
    public int age;
    
    static {
        System.out.println("��ã��й�");
    }
    public User() {
        System.out.println("�޲������췽��!!!");
    }

    public User(String s) {

    }

    public void sun() {
        System.out.println("��������ò��ԣ�");
    }
}
