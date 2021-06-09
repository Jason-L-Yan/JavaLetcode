package com.bjpowernode.service.impl;

import com.bjpowernode.dao.CharDao;
import com.bjpowernode.dao.impl.CharDaoImpl;
import com.bjpowernode.service.CharService;

import java.util.Map;

public class CharServiceImpl implements CharService {

    private CharDao charDao = new CharDaoImpl();
    @Override
    public Map<String, Integer> bookTypeCount() {

        return charDao.bookTypeCount();
    }
}
