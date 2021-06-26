package com.aoligei.jdbc.learningTest1;

import java.sql.*;

/*
ע�������ĵڶ��ַ�ʽ�������ע��

mysql�ĳ���д���ࣺ
public class Driver extends NonRegisteringDriver implements java.sql.Driver {
	// static ������������ʱ������
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
            // 1. ע���������˾����ע��
            Class.forName("com.mysql.jdbc.Driver");
            // 2. ��ȡ����
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // 3. ��ȡ����
            stmt = conn.createStatement();
            // 4. ִ��SQL���
            String sql = "select empno as eo, ename as '����', sal from emp";
            ResultSet resultSet = stmt.executeQuery(sql);
            while (resultSet.next()) {
                int empno = resultSet.getInt("eo");
                String ename = resultSet.getString("����");
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
