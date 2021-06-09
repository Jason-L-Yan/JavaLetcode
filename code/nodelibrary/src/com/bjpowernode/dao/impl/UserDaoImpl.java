package com.bjpowernode.dao.impl;

import com.bjpowernode.bean.Constant;
import com.bjpowernode.bean.PathConstant;
import com.bjpowernode.bean.User;
import com.bjpowernode.dao.UserDao;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImpl implements UserDao {
    /**
     * 从硬盘文件中读取数据
     * @return
     */
    @Override
    public List<User> select() {
        // 写一个输入流自动关闭的形式
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH))) {
//            System.out.println("=======测试==========");
            List<User> list = (List<User>) ois.readObject();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        }

        // 如果上面出现了异常，则返回一个List对象。该对象什么也没有，没有写
        return new ArrayList<>();
    }

    /**
     * 添加操作，将文件放到文件中
     * @param user
     */
    @Override
    public void add(User user) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            // 读取文件中的List对象
            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();
            if (list != null) {
                // 获取List中最后User对象。
                User lastUser = list.get(list.size() - 1);
                // 生成用户编号
                user.setId(lastUser.getId() + 1);
                // 将user对象放入到List中，然后写出到文件中。
                list.add(user);

            } else {
                list = new ArrayList<>();
                user.setId(1001);
                list.add(user);
            }

            oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
            oos.writeObject(list);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            // 抛给控制层，不然删除没成功，在这部分程序中已被try-catch处理，控制器中不会有异常。
            throw new RuntimeException();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 修改
     * @param user
     */
    @Override
    public void update(User user) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        // 将list数据从文件中查询出来
        try {

            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();
            if (list != null) {
                // 从list中查找要修改的数据,u是list中的数据，user是修改之后的数据
                User originUser = list.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
                // 修改数据（内存中）
                originUser.setName(user.getName());
                originUser.setMoney(user.getMoney());

                // 将数据持久化文件中
                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
                oos.writeObject(list);
                oos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // 抛给控制层，不然删除没成功，在这部分程序中已被try-catch处理，控制器中不会有异常。
            throw new RuntimeException();
        }  finally {
            try {
                if (ois != null) {
                    ois.close();
                }

                if (oos != null) {
                    oos.close();
                }

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 用户删除
     * @param id  因为id是唯一标识符，所以可以通过id删除用户数据。
     */
    @Override
    public void delete(int id) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();

            // 集合转成流，利用stream流查找元素
            User user = list.stream().filter(u -> u.getId() == id).findFirst().get();
            // 从list中将该user删除
            list.remove(user);

            // 将list写出到文件中
            oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
            oos.writeObject(list);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            // 抛给控制层，不然删除没成功，在这部分程序中已被try-catch处理，控制器中不会有异常。
            throw new RuntimeException();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }
                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * 冻结
     * @param id
     */
    @Override
    public void frozen(int id) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();
            User user = list.stream().filter(u -> u.getId() == id).findFirst().get();
            user.setStatus(Constant.USER_FROZEN);

            // 将数据持久化到文件中
            oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
            oos.writeObject(list);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException();
        } finally {
            try {
                if (ois != null) {
                    ois.close();
                }

                if (oos != null) {
                    oos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
