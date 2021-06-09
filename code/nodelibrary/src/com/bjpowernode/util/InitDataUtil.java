package com.bjpowernode.util;

import com.bjpowernode.bean.*;

import java.io.*;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class InitDataUtil implements Serializable {  // IO传输实现接口
//    private static final long serialVersionUID = 66L;
    public static void main(String[] args) {
        // 初始化用户数据
        List<User> userList = new ArrayList<>();
        userList.add(new User(1001, "张大虎", Constant.USER_OK, BigDecimal.TEN));
        initData(PathConstant.USER_PATH, userList);

        // 初始胡图书数据
        List<Book> bookList = new ArrayList<>();
        bookList.add(new Book(1, "java入门", "张三", Constant.TYPE_COMPUTER, "123-1", "机械工业出版社", Constant.STATUS_STORAGE));
        bookList.add(new Book(2, "java进阶", "李四", Constant.TYPE_COMPUTER, "123-1", "机械工业出版社", Constant.STATUS_STORAGE));
        initData(PathConstant.BOOK_PATH, bookList);

        // 初始化借阅数据, 张大虎借java入门这本书。
        List<Lend> lendList = new ArrayList<>();
        User user = new User(1001, "张大虎", Constant.USER_OK, BigDecimal.TEN);
        Book book = new Book(1, "java入门", "张三", Constant.TYPE_COMPUTER, "123-1", "机械工业出版社", Constant.STATUS_STORAGE);
        Lend lend = new Lend();
        // 使用UUID（与电脑Mac地址、当前时钟有关）生成编号：生成的数据不会重复
        lend.setId(UUID.randomUUID().toString());
        lend.setUser(user);
        lend.setBook(book);
        lend.setStatus(Constant.STATUS_LEND);
        // 出借日期
        LocalDate begin = LocalDate.now();
        lend.setLendDate(begin);
        // 设置归还日期
        lend.setReturnDate(begin.plusDays(30));
//        lendList.addAll(lend);  // 此处不能用addAll,因为addAll中要求存储的参数是 java.util.Collection<? extends E> c
        lendList.add(lend);
        initData(PathConstant.LEND_PATH, lendList);
    }

    /**
     * 初始化数据（合并以下两个程序——初始化用户数据和初始化图书数据）
     * 因为两个程序相似，可以设置一个通用的程序完成功能。
     *
     */
    public static void initData(String path, List<?>list) {  // ?是通配符，任何泛型都可以
        ObjectOutputStream oos = null;
        try {
            // 项目中有图书数据、借阅数据、用户数据等多种数据，要分开建立存放
            // 创建相关文件夹
            File directory = new File(path.split("/")[0] + "/");  // 创建文件夹
            File file = new File(path);
            // 判断文件夹是否存在，否则创建
            if (!directory.exists()) {
                // 如果不存在，创建文件夹
                directory.mkdir();
            }

            // 判断文件是否存在
            if (!file.exists()) {
                file.createNewFile();
                // 用户数据放在ArrayList中。多态
//                List<User> list = new ArrayList<>();
//                // 判断userList中，如果没有数据，自己创建
//                if (userList == null) {
//                    System.out.println("闪闪红星照中国");
//                    list.add(new User(1001, "张大虎", Constant.USER_OK, BigDecimal.TEN));
//                } else {
//                    list = userList;
//                }
                // 利用对象输出流，将list数据写出到文件中
                oos = new ObjectOutputStream(new FileOutputStream(path));  // 序列化，将对象从内存写到文件中
                oos.writeObject(list);

                // 管道刷新
                oos.flush();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 关闭流
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
     * 初始化用户数据
     */
//    public static void initUser(List<User> userList) {
//        ObjectOutputStream oos = null;
//        try {
//            // 项目中有图书数据、借阅数据、用户数据等多种数据，要分开建立存放
//            // 创建相关文件夹
//            File directory = new File("user/");  // 创建文件夹
//            File file = new File(PathConstant.USER_PATH);
//            // 判断文件夹是否存在，否则创建
//            if (!directory.exists()) {
//                // 如果不存在，创建文件夹
//                directory.mkdir();
//            }
//
//            // 判断文件是否存在
//            if (!file.exists()) {
//                file.createNewFile();
//                // 用户数据放在ArrayList中。多态
//                List<User> list = new ArrayList<>();
//                // 判断userList中，如果没有数据，自己创建
//                if (userList == null) {
//                    System.out.println("闪闪红星照中国");
//                    list.add(new User(1001, "张大虎", Constant.USER_OK, BigDecimal.TEN));
//                } else {
//                    list = userList;
//                }
//                // 利用对象输出流，将list数据写出到文件中
//                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));  // 序列化，将对象从内存写到文件中
//                oos.writeObject(list);
//
//                // 管道刷新
//                oos.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭流
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
     * 初始化图书数据
     */
//    public static void initBook(List<Book> bookList) {
//        ObjectOutputStream oos = null;
//        try {
//            // 项目中有图书数据、借阅数据、用户数据等多种数据，要分开建立存放
//            // 创建相关文件夹
//            File directory = new File("book/");  // 创建文件夹
//            File file = new File(PathConstant.BOOK_PATH);
//            // 判断文件夹是否存在，否则创建
//            if (!directory.exists()) {
//                // 如果不存在，创建文件夹
//                directory.mkdir();
//            }
//
//            // 判断文件是否存在
//            if (!file.exists()) {
//                file.createNewFile();
//                // 用户数据放在ArrayList中。多态
//                List<Book> list = new ArrayList<>();
//                // 判断userList中，如果没有数据，自己创建
//                if (bookList == null) {
//                    System.out.println("闪闪红星照中国");
//                    list.add(new Book(1, "java入门", "张三", Constant.TYPE_COMPUTER, "123-1", "机械工业出版社", Constant.STATUS_STORAGE));
//                } else {
//                    list = bookList;
//                }
//                // 利用对象输出流，将list数据写出到文件中
//                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));  // 序列化，将对象从内存写到文件中
//                oos.writeObject(list);
//
//                // 管道刷新
//                oos.flush();
//            }
//        } catch (IOException e) {
//            e.printStackTrace();
//        } finally {
//            // 关闭流
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