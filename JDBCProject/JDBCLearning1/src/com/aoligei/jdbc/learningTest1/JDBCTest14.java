package com.aoligei.jdbc.learningTest1;

import com.aoligei.jdbc.learningTest1.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
����������ж�job='MANAGER'�ļ�¼����update������
 */
public class JDBCTest14 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // ��ȡ����
            conn = DBUtil.getConnection();
            // ִ��
            String sql = "update emp set sal = sal * 10 where job = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "Manager");
            int count = ps.executeUpdate();
            System.out.println("������" + count + "����" );
        } catch (SQLException throwables) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        }  finally {
            DBUtil.close(conn, ps, null);
        }
    }
}
