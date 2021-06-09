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
     * ��Ӳ���ļ��ж�ȡ����
     * @return
     */
    @Override
    public List<User> select() {
        // дһ���������Զ��رյ���ʽ
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH))) {
//            System.out.println("=======����==========");
            List<User> list = (List<User>) ois.readObject();
            return list;

        } catch (Exception e) {
            e.printStackTrace();
        }

        // �������������쳣���򷵻�һ��List���󡣸ö���ʲôҲû�У�û��д
        return new ArrayList<>();
    }

    /**
     * ��Ӳ��������ļ��ŵ��ļ���
     * @param user
     */
    @Override
    public void add(User user) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            // ��ȡ�ļ��е�List����
            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();
            if (list != null) {
                // ��ȡList�����User����
                User lastUser = list.get(list.size() - 1);
                // �����û����
                user.setId(lastUser.getId() + 1);
                // ��user������뵽List�У�Ȼ��д�����ļ��С�
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
            // �׸����Ʋ㣬��Ȼɾ��û�ɹ������ⲿ�ֳ������ѱ�try-catch�����������в������쳣��
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
     * �޸�
     * @param user
     */
    @Override
    public void update(User user) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        // ��list���ݴ��ļ��в�ѯ����
        try {

            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();
            if (list != null) {
                // ��list�в���Ҫ�޸ĵ�����,u��list�е����ݣ�user���޸�֮�������
                User originUser = list.stream().filter(u -> u.getId() == user.getId()).findFirst().get();
                // �޸����ݣ��ڴ��У�
                originUser.setName(user.getName());
                originUser.setMoney(user.getMoney());

                // �����ݳ־û��ļ���
                oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
                oos.writeObject(list);
                oos.flush();
            }
        } catch (Exception e) {
            e.printStackTrace();
            // �׸����Ʋ㣬��Ȼɾ��û�ɹ������ⲿ�ֳ������ѱ�try-catch�����������в������쳣��
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
     * �û�ɾ��
     * @param id  ��Ϊid��Ψһ��ʶ�������Կ���ͨ��idɾ���û����ݡ�
     */
    @Override
    public void delete(int id) {
        ObjectInputStream ois = null;
        ObjectOutputStream oos = null;
        try {
            ois = new ObjectInputStream(new FileInputStream(PathConstant.USER_PATH));
            List<User> list = (List<User>) ois.readObject();

            // ����ת����������stream������Ԫ��
            User user = list.stream().filter(u -> u.getId() == id).findFirst().get();
            // ��list�н���userɾ��
            list.remove(user);

            // ��listд�����ļ���
            oos = new ObjectOutputStream(new FileOutputStream(PathConstant.USER_PATH));
            oos.writeObject(list);
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            // �׸����Ʋ㣬��Ȼɾ��û�ɹ������ⲿ�ֳ������ѱ�try-catch�����������в������쳣��
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
     * ����
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

            // �����ݳ־û����ļ���
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
