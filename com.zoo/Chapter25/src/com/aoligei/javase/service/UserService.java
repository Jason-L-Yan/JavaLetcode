package com.aoligei.javase.service;

/**
 * �û�ҵ����
 */
public class UserService {
    /**
     * ��¼����
     * 
     * @param name     �û���
     * @param password ����
     * @return true��ʾ��¼�ɹ���false��ʾ��¼ʧ�ܣ�
     */
    public boolean login(String name, String password) {
        if ("admin".equals(name) && "123".equals(password)) {
            return true;
        }
        return false;
    }

    // ���ܻ���һ��ͬ��login����
    // java����ô����һ�������������������Ͳ����б�
    public void login(int i) {

    }

    /**
     * �˳�ϵͳ�ķ���
     */
    public void logout() {
        System.out.println("ϵͳ�Ѿ���ȫ�˳���");
    }

}
