/*
ģ��һ��ϵͳ���������ϵͳҪʹ�ã����������û��������롣
 */

package com.huawei.javaSE.array;

public class ArrayTest6 {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("ʹ�ø�ϵͳʱ�������������������а����û�����������Ϣ�����磺zhangsan 123");
            return;
        }

        // ����ִ�е��˴�˵���û�ȷʵ�ṩ���û��������롣
        // ��������Ӧ���ж��û����������Ƿ���ȷ��
        // ȡ���û���
        String name = args[0];
        // ȡ������
        String password = args[1];

        // �����û�����admin��������123��ʱ���ʾ��¼�ɹ�������һ��ʧ�ܡ�
        // �ж������ַ����Ƿ���ȣ���Ҫʹ��equals������
        // if(name.equals("admin") && password.equals("123")){
        // ������д�ǲ��ǿ��Ա����ָ���쳣��
        // �������±����񣬼�ʱusername��password����null��Ҳ������ֿ�ָ���쳣���������ϳ���Ա����һ����̾��顣��
        if ("admin".equals(name) && "123".equals(password)) {
            System.out.println("��¼�ɹ�����ӭ[" + name + "]����");
            System.out.println("�����Լ���ʹ�ø�ϵͳ....");
        } else {
            System.out.println("��֤ʧ�ܣ��û��������ڻ����������");
        }
    }
}
