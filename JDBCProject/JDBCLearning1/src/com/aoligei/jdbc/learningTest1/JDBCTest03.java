package com.aoligei.jdbc.learningTest1;

import java.sql.*;

public class JDBCTest03 {
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        ResultSet resultSet = null;
        try {
            Driver driver = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver);
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            conn = DriverManager.getConnection(url, "root", "5555" );
            stmt = conn.createStatement();
            String sql = "select e.empno, e.ename, d.dname, sal from emp e join dept d on d.deptno = e.deptno";
            resultSet = stmt.executeQuery(sql);

            while (resultSet.next()) {
                int empno = resultSet.getInt("empno");
                String ename = resultSet.getString("ename");
                String dname = resultSet.getString("dname");
                double sal = resultSet.getDouble("sal");
                System.out.println(empno + "," + ename + "," + dname + "," + (sal + 10));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (resultSet != null) {
                    resultSet.close();
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
