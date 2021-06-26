package com.aoligei.jdbc.learningTest1.utils;
/*
    ���ݿ��װ�࣬����JDBC�Ĵ����д
 */

import java.sql.*;
import java.util.ResourceBundle;

public class DBUtil {

    // �������еĹ��췽��һ�㶼��˽�л��ģ�Ϊʲô��
    // ���췽��˽�л���Ϊ�˷�ֹnew����Ϊʲô��ֹnew����
    // ��Ϊ�������еķ������Ǿ�̬�ģ�����Ҫnew ����ֱ��ʹ�á�����.���ķ�ʽ����
    private DBUtil(){}
    // �����ʱ�󶨾�̬������Դ�ļ�
    private static ResourceBundle bundle = ResourceBundle.getBundle("resources/db");

    // ע������
    static {
        try {
            Class.forName(bundle.getString("driver"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * ��ȡ���ݿ����Ӷ���
     * @return �µ����Ӷ���
     * @throws SQLException �쳣
     */
    public static Connection getConnection() throws SQLException {
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pwd = bundle.getString("password");
        Connection conn = DriverManager.getConnection(url, user, pwd);
        return conn;
    }

    /**
     * �ͷ���Դ
     * @param conn ���Ӷ���
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
