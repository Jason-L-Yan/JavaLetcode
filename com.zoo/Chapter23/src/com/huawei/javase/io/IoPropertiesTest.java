package com.huawei.javase.io;

import java.io.FileReader;
import java.util.Properties;

/*
IO+Properties������Ӧ�á�
�ǳ��õ�һ��������
    �Ժ󾭳��ı�����ݣ����Ե���д��һ���ļ��У�ʹ�ó���̬��ȡ��
    ����ֻ��Ҫ�޸�����ļ������ݣ�java���벻��Ҫ�Ķ�������Ҫ����
    ���룬������Ҳ����Ҫ�������Ϳ����õ���̬����Ϣ��

    ���������ϻ��Ƶ������ļ�����Ϊ�����ļ���
    ���ҵ������ļ��е����ݸ�ʽ�ǣ�
        key1=value
        key2=value
    ��ʱ�����ǰ����������ļ��������������ļ���

    java�淶����Ҫ�����������ļ�������.properties��β�����ⲻ�Ǳ���ġ�
    ������.properties��β���ļ���java�б���Ϊ�����������ļ���
    ����Properties��ר�Ŵ�����������ļ����ݵ�һ���ࡣ
 */
public class IoPropertiesTest {
    public static void main(String[] args) throws Exception {
        /*
         * Properties��һ��Map���ϣ�key��value����String���͡� �뽫userinfo�ļ��е����ݼ��ص�Properties�����С�
         */
        // �½�һ������������
        FileReader reader = new FileReader("userinfo.properties");
        // �½�һ��Map����
        Properties pro = new Properties();

        // ����Properties�����load�������ļ��е����ݼ��ص�Map�����С�
        pro.load(reader); // �ļ��е�����˳�Źܵ����ص�Map�����У����еȺ�=�����key���ұ���value

        // ͨ��key����ȡvalue�أ�
        String userName = pro.getProperty("username");
        System.out.println(userName);

        String password = pro.getProperty("password");
        System.out.println(password);

        String data = pro.getProperty("data");
        System.out.println(data);

        String usernamex = pro.getProperty("usernamex");
        System.out.println(usernamex);
    }
}
