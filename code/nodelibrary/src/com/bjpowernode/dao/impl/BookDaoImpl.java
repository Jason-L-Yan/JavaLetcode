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
     * ��ѯ
     * @param book
     * @return
     */
    @Override
    public List<Book> select(Book book) {
        // ���ȴ��ļ��ж�ȡ����
        ObjectInputStream ois = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PathConstant.BOOK_PATH));
            List<Book> list = (List<Book>) ois.readObject();
            if (list != null) {
                if (book == null || ("".equals(book.getBookName()) && "".equals(book.getIsbn()))) {
                    // ��ѯȫ�����ݵĲ���
                    return list;
                } else {
                    List<Book> conditionList = new ArrayList<>();
                    // ������ѯ
                    // �ж�������ѯ����ͬʱ����
                    if (!"".equals(book.getBookName()) && !"".equals(book.getIsbn())) {
                        conditionList = list.stream().filter(b -> b.getBookName().equals(book.getBookName())).collect(Collectors.toList());
                        // ��β�ѯ������һ����ѯ�Ľ��
                        conditionList = conditionList.stream().filter(b -> b.getIsbn().equals(book.getIsbn())).collect(Collectors.toList());
                    } else {
                        // ����������ѯ
                        if (!"".equals(book.getBookName())) {  // ��Ϊ�ս����ѯ����
                            // ����ͼ�����Ʋ�ѯ
                            conditionList = list.stream().filter(b -> b.getBookName().equals(book.getBookName())).collect(Collectors.toList());
                        }


                        if (!"".equals(book.getIsbn())) {  // ��Ϊ�ս����ѯ����
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
    // listΪ�գ�����һ���յļ���
        return new ArrayList<>();
    }
}
