package com.aoligei.jdbc.learningTest1.utils;
/*
    数据库封装类，便于JDBC的代码编写
 */

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {

    // 工具类中的构造方法一般都是私有化的，为什么？
    // 构造方法私有化是为了防止new对象，为什么防止new对象？
    // 因为工具类中的方法都是静态的，不需要new 对象，直接使用“类名.”的方式调用
    private DBUtil(){}
    // 类加载时绑定静态属性资源文件
    private static ResourceBundle bundle = ResourceBundle.getBundle("resources/db");

    // 注册驱动
    static {
        try {
            Class.forName(bundle.getString("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * 获取数据库连接对象
     * @return 新的连接对象
     * @throws SQLException 异常
     */
    public static Connection getConnection() throws SQLException {
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pwd = bundle.getString("password");
        Connection conn = DriverManager.getConnection(url, user, pwd);
        return conn;
    }

    /**
     * 释放资源
     * @param conn 连接对象
     * @param stmt
     * @param res
     */
    public static void close(Connection conn, Statement stmt, ResultSet res) {
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

}
