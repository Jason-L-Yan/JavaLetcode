package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.Scanner;

/**
 * 需求：用户在控制台上输入desc则降序，输入asc则升序
 * 思考一下：这个应该选择Statement还是选择PreparedStatement
 *      选Statement，因为PreparedStatement只能传值，不能进行sql语句的拼接
 */
public class JDBCTest08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入desc或asc【desc表示降序，asc表示升序】");
        // 用户输入
        String orderKey = sc.next();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            String sql = "select ename, sal from emp order by sal ?";  // 这种写法报错，
            ps = conn.prepareStatement(sql);
            ps.setString(1, orderKey);

            res = ps.executeQuery();
            while (res.next()) {
                String ename = res.getString("ename");
                String sal = res.getString("sal");
                System.out.println(ename+ "," +sal);
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
