package com.bjpowernode.dao;

import com.bjpowernode.bean.User;

import java.util.List;

public interface UserDao {
    // �ڰ�util�еĳ������ļ���д����ʱ������������List����˶�ȡʱ��
    // ������������Ҳ��List����
    List<User> select();  // ��ѯ

    void add(User user);

    void update(User user);

    void delete(int id);

    void frozen(int id);
}
