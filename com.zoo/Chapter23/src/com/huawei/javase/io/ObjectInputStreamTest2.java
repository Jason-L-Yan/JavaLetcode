package com.huawei.javase.io;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.List;

/*
�����л�����
 */
public class ObjectInputStreamTest2 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("users"));
        // Object obj = ois.readObject();
        // System.out.println(obj instanceof List);  // true
        // true˵�����Խ���ǿ������ת��
        List<User> userList = (List<User>)ois.readObject();  // 
        for (User user : userList) {
            System.out.println(user);
        }
        ois.close();
    }
}
