package com.huawei.javase.io;
/*
һ�����л���������أ�
    ���ԣ����Խ�����ŵ����ϵ��У����л����ϡ�
��ʾ��
    �������л���ArrayList�����Լ������е�Ԫ��User����Ҫʵ�� java.io.Serializable�ӿڡ�
 */

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class ObjectOutputStreamTest2 {
    public static void main(String[] args) throws Exception{
        List<User> userList = new ArrayList();
        userList.add(new User(1, "zhangsan"));
        userList.add(new User(2, "lisi"));
        userList.add(new User(3, "wangwu"));
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("users"));

        // ���л�һ�����ϣ���������з��˺ܶ���������
        oos.writeObject(userList);

        oos.flush();
        oos.close();
    }
}
