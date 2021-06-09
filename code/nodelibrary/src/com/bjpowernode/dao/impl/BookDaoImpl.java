package com.bjpowernode.dao.impl;

import com.bjpowernode.bean.Book;
import com.bjpowernode.bean.PathConstant;
import com.bjpowernode.dao.BookDao;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookDaoImpl implements BookDao {

    /**
     * 查询
     * @param book
     * @return
     */
    @Override
    public List<Book> select(Book book) {
        // 首先从文件中读取数据
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PathConstant.BOOK_PATH));
            List<Book> list = (List<Book>) ois.readObject();
            if (list != null) {
                if (book == null || ("".equals(book.getBookName()) && "".equals(book.getIsbn()))) {
                    // 查询全部数据的操作
                    return list;
                } else {
                    List<Book> conditionList = new ArrayList<>();
                    // 条件查询
                    // 判断两个查询条件同时输入
                    if (!"".equals(book.getBookName()) && !"".equals(book.getIsbn())) {
                        conditionList = list.stream().filter(b -> b.getBookName().equals(book.getBookName())).collect(Collectors.toList());
                        // 这次查询基于上一步查询的结果
                        conditionList = conditionList.stream().filter(b -> b.getIsbn().equals(book.getIsbn())).collect(Collectors.toList());
                    } else {
                        // 单个条件查询
                        if (!"".equals(book.getBookName())) {  // 不为空进入查询数据
                            // 根据图书名称查询
                            conditionList = list.stream().filter(b -> b.getBookName().equals(book.getBookName())).collect(Collectors.toList());
                        }


                        if (!"".equals(book.getIsbn())) {  // 不为空进入查询数据
                            conditionList = list.stream().filter(b -> b.getIsbn().equals(book.getIsbn())).collect(Collectors.toList());
                        }

                    }
                    return conditionList;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    // list为空，返回一个空的集合
        return new ArrayList<>();
    }
}
