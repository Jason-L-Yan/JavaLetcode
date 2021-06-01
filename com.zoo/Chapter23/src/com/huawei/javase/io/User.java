package com.huawei.javase.io;

import java.io.Serializable;

public class User implements Serializable {

    private int no;
    // transient�ؼ��ֱ�ʾ����ģ����������л���
    private transient String name; // name���������л�������

    public User() {
    }

    public User(int no, String name) {
        this.no = no;
        this.name = name;
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

    @Override
    public String toString() {
        return "User [name=" + name + ", no=" + no + "]";
    }

}
