package com.aoligei.jdbc.learningTest1;

import com.aoligei.jdbc.learningTest1.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCTest12 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            // ��ȡ����
            conn = DBUtil.getConnection();
            // ��ȡԤ��������ݿ��������
            String sql = "select ename, sal from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            // ������ֵ
            ps.setString(1,"A%");
            res = ps.executeQuery();
            while (res.next()) {
                System.out.println(res.getString("ename") + "," + res.getDouble("sal"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, res);
            // ���û�н�������󣬵������������ʱ�������������null��
            // DBUtil.close(conn, ps, null);
        }
    }
}
