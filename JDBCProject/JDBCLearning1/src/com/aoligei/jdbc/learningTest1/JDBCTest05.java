package com.aoligei.jdbc.learningTest1;
/*
˼�룺
    ���������ݿ�Ŀɱ仯��4����Ϣд�������ļ���
    �Ժ��������������ݿ��ʱ�򣬿���ֱ���޸������ļ��������޸�java����
    �ĸ���Ϣ��ʲô��
        1. driver
        2. url
        3. user
        4. password
 */
import java.sql.*;
import java.util.ResourceBundle;

public class JDBCTest05 {
    public static void main(String[] args) {
        // ��Դ����
        ResourceBundle bundle = ResourceBundle.getBundle("Resources/db");
        // ͨ�����������ļ��õ���Ϣ
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String password = bundle.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // 1. ע���������˾����ע��
            Class.forName(driver);
            // 2. ��ȡ����
            System.out.println(url);
            System.out.println(user);
            System.out.println(password);
            conn = DriverManager.getConnection(url, user, password);
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
