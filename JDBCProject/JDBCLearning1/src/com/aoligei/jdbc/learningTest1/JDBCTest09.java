package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.Scanner;

public class JDBCTest09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入desc或asc【desc表示降序，asc表示升序】");
        // 用户输入
        String orderKey = sc.next();

        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            stmt = conn.createStatement();

            String sql = "select ename, sal from emp order by sal " + orderKey;  // 这种写法报错，
            res = stmt.executeQuery(sql);
//            res = ps.executeQuery();
            while (res.next()) {
                String ename = res.getString("ename");
                String sal = res.getString("sal");
                System.out.println(ename + "," + sal);
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
