package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
1. 模拟用户登录

2. 把sc.next()改成sc.nextLine()之后：
用户名：fdsa
密码：fdsa' or '1'='1
select * from t_user where login_name = 'fdsa' and login_pwd = 'fdsa' or '1'='1'
登录成功！
以上随意输入一个用户名和密码，登录成功了，这种现象被称为SQL注入现象！

3. 导致SQL注入的根本原因是啥？怎么解决
用户提供的信息参与了SQL语句的编译
主要因素：这个程序是先进行的字符串拼接，然后再执行SQL语句的编译，正好被注入。

 */
public class JDBCTest06 {
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
        Statement stmt = null;
        ResultSet res = null;

        try {
            // 注册数据库
            Class.forName(driver);
            // 连接数据库
            conn = DriverManager.getConnection(url, user, pwd);
            // 创建对象
            stmt = conn.createStatement();
            // 方案一：
            // 执行SQL语句
//            res = stmt.executeQuery("select login_name, login_pwd, real_name from t_user");
//            // 处理查询数据集
//            while (res.next()) {
//                if ((res.getString("login_name").equals(loginName)) && (res.getString("login_pwd").equals(loginPwd))) {
//                    return true;
//                }
//
//            }

            // 方案二：
            // 使用该sql语句不需要使用while循环
            String sql = "select * from t_user where login_name = '" + loginName + "' and login_pwd = '" + loginPwd + "'";
            System.out.println(sql);
            // 如果以上sql语句中用户名和密码正确，那么结果集最多也就查询出一条记录，所以以下不需要while循环
            res = stmt.executeQuery(sql);
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
