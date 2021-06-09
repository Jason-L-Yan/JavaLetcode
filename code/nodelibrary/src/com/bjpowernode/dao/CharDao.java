package com.bjpowernode.dao;

import java.util.Map;

public interface CharDao {
    // String对应类别名称，如：计算机、文学、经济等
    // Integer对应存放数量
    Map<String, Integer> bookTypeCount();
}
