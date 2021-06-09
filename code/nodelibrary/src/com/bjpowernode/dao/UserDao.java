package com.bjpowernode.dao;

import com.bjpowernode.bean.User;

import java.util.List;

public interface UserDao {
    // 在包util中的程序，往文件中写数据时，数据类型是List，因此读取时，
    // 定义数据类型也是List类型
    List<User> select();  // 查询

    void add(User user);

    void update(User user);

    void delete(int id);

    void frozen(int id);
}
