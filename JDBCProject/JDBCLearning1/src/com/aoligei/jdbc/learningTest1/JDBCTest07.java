package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
/*
怎么避免SQL注入？
主要原因：用户提供的信息参与了SQL语句的编译

java.sql.Statement接口的特点：先进行字符串的拼接，然后再进行sql语句的编译。
    优点：使用Ststement可以进行SQL语句的拼接
    缺点：因为拼接的存在，导致可能给不法分子机会，导致SQL注入
java.sql.PreparedStatement接口特点：先进行SQL语句编译，然后再进行SQL语句传值。
    优点：避免SQL注入
    缺点：没有办法进行SQL语句拼接，只能给SQL语句传值。

 */
public class JDBCTest07 {
    public static void main(String[] args) {

        // 初始化一个界面，可以让用户输入密码和名字
        Map<String, String> uesrLoginInfo = initUI();

        // 连接数据库验证用户名和密码是否正确
        Boolean ok = checkNameandPwd(uesrLoginInfo.get("loginName"), uesrLoginInfo.get("loginPwd"));
        System.out.println(ok ? "登录成功！" : "登录失败！");
    }

    /**
     * 验证用户名和密码
     * @param loginName 登录名
     * @param loginPwd  密码
     * @return  true表示登录成功，false表示登录失败
     */
    private static Boolean checkNameandPwd(String loginName, String loginPwd) {
        Boolean ok = false;
        ResourceBundle bundle = ResourceBundle.getBundle("resources/db");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pwd = bundle.getString("password");
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet res = null;

        try {
            // 注意连接步骤3和4顺序变了
            // 1.注册数据库
            Class.forName(driver);
            // 2.连接数据库
            // 一个问号？是一个占位符，一个占位符只能接收一个“值/数据”
            conn = DriverManager.getConnection(url, user, pwd);
            // 4.获取预编译的数据库操作对象
            String sql = "select * from t_user where login_name = ? and login_pwd = ?";
            // 3.创建对象
            stmt = conn.prepareStatement(sql);  // 此时会发送sql给DBMS，进行sql语句的==编译==
            // 给占位符？传值
            // 怎么解决SQL语句注入问题的：即使用户信息中有SQL关键字，但是不参加编译就没事
            stmt.setString(1, loginName);  // jdbc中所以下标从1开始，代表第一个占位符
            stmt.setString(2, loginPwd);
            // 4.执行SQL语句
            res = stmt.executeQuery();
            if (res.next()) {
                ok = true;
            }

            return ok;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 释放资源
            try {
                if (res != null) {
                    res.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;
    }

    private static Map<String, String> initUI() {
        // 初始化一个界面，可以让用户输入密码和名字
        System.out.print("用户名：");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("密码：");
        String pwd = sc.nextLine();
        Map<String, String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName", name);
        userLoginInfo.put("loginPwd", pwd);
        return userLoginInfo;
    }
}
