package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.Scanner;

/**
 * �����û��ڿ���̨������desc��������asc������
 * ˼��һ�£����Ӧ��ѡ��Statement����ѡ��PreparedStatement
 *      ѡStatement����ΪPreparedStatementֻ�ܴ�ֵ�����ܽ���sql����ƴ��
 */
public class JDBCTest08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("������desc��asc��desc��ʾ����asc��ʾ����");
        // �û�����
        String orderKey = sc.next();

        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            String sql = "select ename, sal from emp order by sal ?";  // ����д������
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
