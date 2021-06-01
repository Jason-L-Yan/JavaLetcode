package com.huawei.javase.io;
/*
1��java.io.NotSerializableException:
    Student����֧�����л���������

2���������л��ͷ����л��Ķ��󣬱���ʵ��Serializable�ӿڡ�

3��ע�⣺ͨ��Դ���뷢�֣�Serializable�ӿ�ֻ��һ����־�ӿڣ�
    public interface Serializable {
    }
    ����ӿڵ���ʲô���붼û�С�
    ��ô����һ��ʲô�����أ�
        �𵽱�ʶ�����ã���־�����ã�java��������������ʵ��������ӿڣ����ܻ�������������������
        Serializable�����־�ӿ��Ǹ�java������ο��ģ�java�������������ӿ�֮�󣬻�Ϊ�����Զ�����
        һ�����л��汾�š�

4�����л��汾����ʲô���أ�
    java.io.InvalidClassException:
        com.bjpowernode.java.bean.Student;
        local class incompatible:
            stream classdesc serialVersionUID = -684255398724514298��ʮ���,
            local class serialVersionUID = -3463447116624555755��ʮ��ǰ��

    java�������ǲ���ʲô������������ģ�
        ��һ������ͨ���������бȶԣ����������һ�����϶�����ͬһ���ࡣ
        �ڶ����������һ��������ô����������𣿿����л��汾�Ž������֡�

    С����д��һ���ࣺcom.bjpowernode.java.bean.Student implements Serializable
    ���˱�д��һ���ࣺcom.bjpowernode.java.bean.Student implements Serializable
    ��ͬ���˱�д��ͬһ���࣬������������ȷʵ����ͬһ���ࡱ�����ʱ�����л��汾�����������ˡ�
    ����java�������˵��java������ǿ������ֿ���������ģ���Ϊ�������඼ʵ����Serializable�ӿڣ�
    ����Ĭ�ϵ����л��汾�ţ����ǵ����л��汾�Ų�һ�����������ֿ��ˡ��������Զ��������л��汾�ŵĺô���

    ��˼����
        �����Զ��������л��汾����ʲôȱ�ݣ�
            �����Զ����ɵ����л��汾��ȱ���ǣ�һ������ȷ��֮�󣬲��ܽ��к������޸ģ�
            ��ΪֻҪ�޸ģ���Ȼ�����±��룬��ʱ������ȫ�µ����л��汾�ţ����ʱ��java
            ���������Ϊ����һ��ȫ�µ��ࡣ�������Ͳ����ˣ���

    ���ս��ۣ�
        ����һ����ʵ����Serializable�ӿڣ�����������ṩһ���̶���������л��汾�š�
        �������Ժ�����༴ʹ�����޸��ˣ����ǰ汾�Ų��䣬java���������Ϊ��ͬһ���ࡣ

 */
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamTest {
    public static void main(String[] args) throws Exception {
        // ����java����
        Student s = new Student(110, "zhangSan");
        // ���л�
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("students"));

        // ���л�����
        oos.writeObject(s);

        // ˢ��
        oos.flush();
        // �ر�
        oos.close();


    }
}
