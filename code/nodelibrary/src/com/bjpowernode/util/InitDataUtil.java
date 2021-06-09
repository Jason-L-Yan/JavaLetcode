package com.bjpowernode.util;

import com.bjpowernode.bean.*;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InitDataUtil implements Serializable {  // IO����ʵ�ֽӿ�
//    private static final long serialVersionUID = 66L;
    public static void main(String[] args) {
        // ��ʼ���û�����
        List<User> userList = new ArrayList<>();
        userList.add(new User(1001, "�Ŵ�", Constant.USER_OK, BigDecimal.TEN));
        initData(PathConstant.USER_PATH, userList);

        // ��ʼ��ͼ������
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "java����", "����", Constant.TYPE_COMPUTER, "123-1", "��е��ҵ������", Constant.STATUS_STORAGE));
        bookList.add(new Book(2, "java����", "����", Constant.TYPE_COMPUTER, "123-1", "��е��ҵ������", Constant.STATUS_STORAGE));
        initData(PathConstant.BOOK_PATH, bookList);

        // ��ʼ����������, �Ŵ󻢽�java�����Ȿ�顣
        List<Lend> lendList = new ArrayList<>();
        User user = new User(1001, "�Ŵ�", Constant.USER_OK, BigDecimal.TEN);
        Book book = new Book(1, "java����", "����", Constant.TYPE_COMPUTER, "123-1", "��е��ҵ������", Constant.STATUS_STORAGE);
        Lend lend = new Lend();
        // ʹ��UUID�������Mac��ַ����ǰʱ���йأ����ɱ�ţ����ɵ����ݲ����ظ�
        lend.setId(UUID.randomUUID().toString());
        lend.setUser(user);
        lend.setBook(book);
        lend.setStatus(Constant.STATUS_LEND);
        // ��������
        LocalDate begin = LocalDate.now();
        lend.setLendDate(begin);
        // ���ù黹����
        lend.setReturnDate(begin.plusDays(30));
//        lendList.addAll(lend);  // �˴�������addAll,��ΪaddAll��Ҫ��洢�Ĳ����� java.util.Collection<? extends E> c
        lendList.add(lend);
        initData(PathConstant.LEND_PATH, lendList);
    }

    /**
     * ��ʼ�����ݣ��ϲ������������򡪡���ʼ���û����ݺͳ�ʼ��ͼ�����ݣ�
     * ��Ϊ�����������ƣ���������һ��ͨ�õĳ�����ɹ��ܡ�
     *
     */
    public static void initData(String path, List<?>list) {  // ?��ͨ������κη��Ͷ�����
        ObjectOutputStream oos = null;
        try {
            // ��Ŀ����ͼ�����ݡ��������ݡ��û����ݵȶ������ݣ�Ҫ�ֿ��������
            // ��������ļ���
            File directory = new File(path.split("/")[0] + "/");  // �����ļ���
            File file = new File(path);
            // �ж��ļ����Ƿ���ڣ����򴴽�
            if (!directory.exists()) {
                // ��������ڣ������ļ���
                directory.mkdir();
            }

            // �ж��ļ��Ƿ����
            if (!file.exists()) {
                file.createNewFile();
                // �û����ݷ���ArrayList�С���̬
//                List<User> list = new ArrayList<>();
//                // �ж�userList�У����û�����ݣ��Լ�����
//                if (userList == null) {
//                    System.out.println("�����������й�");
//                    list.add(new User(1001, "�Ŵ�", Constant.USER_OK, BigDecimal.TEN));
//                } else {
//                    list = userList;
//                }
                // ���ö������������list����д�����ļ���
                oos = new ObjectOutputStream(new FileOutputStream(path));  // ���л�����������ڴ�д���ļ���
                oos.writeObject(list);

                // �ܵ�ˢ��
                oos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // �ر���
            if (oos != null) {
                try {
                    oos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    /**
     * ��ʼ���û�����
     */
//    public static void initUser(List<User> userList) {
//        ObjectOutputStream oos = null;
//        try {
//            // ��Ŀ����ͼ�����ݡ��������ݡ��û����ݵȶ������ݣ�Ҫ�ֿ��������
//            // ��������ļ���
//            File directory = new File("user/");  // �����ļ���
//            File file = new File(PathConstant.USER_PATH);
//            // �ж��ļ����Ƿ���ڣ����򴴽�
//            if (!directory.exists()) {
//                // ��������ڣ������ļ���
//                directory.mkdir();
//            }
//
//            // �ж��ļ��Ƿ����
//            if (!file.exists()) {
//                file.createNewFile();
//                // �û����ݷ���ArrayList�С���̬
//                List<User> list = new ArrayList<>();
//                // �ж�userList�У����û�����ݣ��Լ�����
//                if (userList == null) {
//                    System.out.println("�����������й�");
//                    list.add(new User(1001, "�Ŵ�", Constant.USER_OK, BigDecimal.TEN));
//                } else {
//                    list = userList;
//                }
//                // ���ö������������list����д�����ļ���
//                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));  // ���л�����������ڴ�д���ļ���
//                oos.writeObject(list);
//
//                // �ܵ�ˢ��
//                oos.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // �ر���
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }

    /**
     * ��ʼ��ͼ������
     */
//    public static void initBook(List<Book> bookList) {
//        ObjectOutputStream oos = null;
//        try {
//            // ��Ŀ����ͼ�����ݡ��������ݡ��û����ݵȶ������ݣ�Ҫ�ֿ��������
//            // ��������ļ���
//            File directory = new File("book/");  // �����ļ���
//            File file = new File(PathConstant.BOOK_PATH);
//            // �ж��ļ����Ƿ���ڣ����򴴽�
//            if (!directory.exists()) {
//                // ��������ڣ������ļ���
//                directory.mkdir();
//            }
//
//            // �ж��ļ��Ƿ����
//            if (!file.exists()) {
//                file.createNewFile();
//                // �û����ݷ���ArrayList�С���̬
//                List<Book> list = new ArrayList<>();
//                // �ж�userList�У����û�����ݣ��Լ�����
//                if (bookList == null) {
//                    System.out.println("�����������й�");
//                    list.add(new Book(1, "java����", "����", Constant.TYPE_COMPUTER, "123-1", "��е��ҵ������", Constant.STATUS_STORAGE));
//                } else {
//                    list = bookList;
//                }
//                // ���ö������������list����д�����ļ���
//                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));  // ���л�����������ڴ�д���ļ���
//                oos.writeObject(list);
//
//                // �ܵ�ˢ��
//                oos.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // �ر���
//            if (oos != null) {
//                try {
//                    oos.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
//    }
}