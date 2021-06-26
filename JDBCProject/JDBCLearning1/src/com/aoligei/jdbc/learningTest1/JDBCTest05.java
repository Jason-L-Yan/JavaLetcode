package com.aoligei.jdbc.learningTest1;
/*
思想：
    将连接数据库的可变化的4条信息写到配置文件中
    以后想连接其他数据库的时候，可以直接修改配置文件，不用修改java程序
    四个信息是什么？
        1. driver
        2. url
        3. user
        4. password
 */
import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest05 {
    public static void main(String[] args) {
        // 资源绑定器
        ResourceBundle bundle = ResourceBundle.getBundle("Resources/db");
        // 通过属性配置文件拿到信息
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动。此句就已注册
            Class.forName(driver);
            // 2. 获取连接
            System.out.println(url);
            System.out.println(user);
            System.out.println(password);
            conn = DriverManager.getConnection(url, user, password);
            // 3. 获取对象
            stmt = conn.createStatement();
            // 4. 执行SQL语句
            String sql = "select empno as eo, ename as '姓名', sal from emp";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int empno = resultSet.getInt("eo");
                String ename = resultSet.getString("姓名");
                double sal = resultSet.getDouble("sal");
                System.out.println(empno + ", " + ename +", " + sal);
            }


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                if (rs != null) {
                    rs.close();
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
}
