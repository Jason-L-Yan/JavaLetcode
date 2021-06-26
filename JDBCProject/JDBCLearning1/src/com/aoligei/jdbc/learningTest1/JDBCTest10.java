package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest10 {
    public static void main(String[] args) {

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // 重点是占位符怎样写？
            String sql = "select ename from emp where ename like ?";  // 这种写法报错，
            ps = conn.prepareStatement(sql);
            ps.setString(1, "%o%");

            res = ps.executeQuery();
            while (res.next()) {
                String ename = res.getString("ename");
                System.out.println(ename);
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {

            try {
                if (res != null) {
                    res.close();
                }
                if (ps != null) {
                    ps.close();
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
