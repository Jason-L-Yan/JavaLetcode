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
    // 用户注册
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
            result = ps.executeUpdate();  // 更新了几条？
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close();
        }
        return result;
    }

    // --重载-----------
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
            result = ps.executeUpdate();  // 更新了几条？
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close(request);
        }
        return result;
    }

    // 查询所有用户查询
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

    // 根据用户编号删除用户信息
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

    // 登录验证
    public int login(String userName, String password) {
        String sql = "select count(*) from users where userName=? and password=?";
        PreparedStatement ps = util.createStatement(sql);
        ResultSet res = null;
        int result = 0;
        try {
            ps.setString(1, userName);
            ps.setString(2, password);
            res = ps.executeQuery();  // 执行之后，res中有一条数据或者没有数据
            while (res.next()) {
                result = res.getInt("count(*)");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            util.close(res);
        }
        return result;  // 返回值为1，说明有这个人
    }
}
