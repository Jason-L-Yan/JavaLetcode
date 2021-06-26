package com.aoligei.jdbc.learningTest1;

import java.sql.*;

/*
注册驱动的第二种方式：类加载注册

mysql的厂家写的类：
public class Driver extends NonRegisteringDriver implements java.sql.Driver {
	// static 代码块在类加载时就运行
	static {
		try {
			java.sql.DriverManager.registerDriver(new Driver());
		} catch (SQLException E) {
			throw new RuntimeException("Can't register driver!");
		}
	}
 */
public class JDBCTest4 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. 注册驱动。此句就已注册
            Class.forName("com.mysql.jdbc.Driver");
            // 2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
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
