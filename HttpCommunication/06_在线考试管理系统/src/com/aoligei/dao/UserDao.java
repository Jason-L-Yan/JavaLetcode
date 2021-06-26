package com.aoligei.dao;

import com.aoligei.entity.Users;
import com.aoligei.util.JdbcUtil;

import javax.servlet.http.HttpServletRequest;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    private JdbcUtil util = new JdbcUtil();
    // �û�ע��
    public int add(Users user) {
        String sql = "insert into users(userName, password, sex, email)" +
                     "values (?,?,?,?)";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;
        try {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();  // �����˼�����
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    // --����-----------
    public int add(Users user, HttpServletRequest request) {
        String sql = "insert into users(userName, password, sex, email)" +
                "values (?,?,?,?)";
        PreparedStatement ps = util.createStatement(sql, request);
        int result = 0;
        try {
            ps.setString(1, user.getUserName());
            ps.setString(2, user.getPassword());
            ps.setString(3, user.getSex());
            ps.setString(4, user.getEmail());
            result = ps.executeUpdate();  // �����˼�����
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close(request);
        }
        return result;
    }

    // ��ѯ�����û���ѯ
    public List findAll() {
        String sql = "select * from users";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet res = null;
        List userList = new ArrayList();
        try {
            res = ps.executeQuery();
            while (res.next()) {
                Integer userId = res.getInt("userId");
                String userName = res.getString("userName");
                String password = res.getString("password");
                String email = res.getString("email");
                String sex = res.getString("sex");
                Users users = new Users(userId, userName, password, sex, email);
                userList.add(users);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close(res);
        }
        return userList;
    }

    // �����û����ɾ���û���Ϣ
    public int delete(String userId) {
        String sql = "delete from users where userId=?";
        PreparedStatement ps = util.createStatement(sql);
        int result = 0;

        try {
            ps.setInt(1, Integer.valueOf(userId));
            result = ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    // ��¼��֤
    public int login(String userName, String password) {
        String sql = "select count(*) from users where userName=? and password=?";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet res = null;
        int result = 0;
        try {
            ps.setString(1, userName);
            ps.setString(2, password);
            res = ps.executeQuery();  // ִ��֮��res����һ�����ݻ���û������
            while (res.next()) {
                result = res.getInt("count(*)");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close(res);
        }
        return result;  // ����ֵΪ1��˵���������
    }
}
