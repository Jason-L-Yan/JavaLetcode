package com.aoligei.javase.reflect;

public class AboutPath {
    public static void main(String[] args) {
        // ���ַ�ʽ��·��ȱ���ǣ���ֲ�Բ��IDEA��Ĭ�ϵĵ�ǰ·����project�ĸ���
        // �����������뿪��IDEA������������λ�ã����ܵ�ǰ·���Ͳ���project�ĸ��ˣ���ʱ���·������Ч�ˡ�
        //FileReader reader = new FileReader("chapter25/classinfo2.properties");

        // ������˵һ�ֱȽ�ͨ�õ�һ��·������ʹ���뻻λ���ˣ�������д��Ȼ��ͨ�õġ�
        // ע�⣺ʹ������ͨ�÷�ʽ��ǰ���ǣ�����ļ���������·���¡�
        // ʲô��·���£���ʽ��src�µĶ�����·���¡�����ס����
        // src����ĸ�·����
        /*
        ���ͣ�
            Thread.currentThread() ��ǰ�̶߳���
            getContextClassLoader() ���̶߳���ķ��������Ի�ȡ����ǰ�̵߳������������
            getResource() ����ȡ��Դ�����������������ķ�������ǰ�̵߳��������Ĭ�ϴ���ĸ�·���¼�����Դ��
         */
        // ���ַ�ʽ��ȡ�ļ�����·����ͨ�õġ�
        String path = Thread.currentThread().getContextClassLoader().getResource("classinfo2.properties").getPath();
        // �������ϵĴ�������õ�һ���ļ��ľ���·����
        System.out.println(path);

        System.out.println("================================================");
        // ��ȡclassinfo3.properties�ļ��ľ���·��������ĸ�·������Ϊ��㿪ʼ��
        String path2 = Thread.currentThread().getContextClassLoader().getResource("com/aoligei/javase/bean/classinfo3.properties").getPath();
        System.out.println(path2);

    }
}
