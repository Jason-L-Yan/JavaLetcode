package com.aoligei.jdbc.learningTest1;

import com.aoligei.jdbc.learningTest1.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/*
在这个事务当中对job='MANAGER'的记录进行update操作。
 */
public class JDBCTest14 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;

        try {
            // 获取连接
            conn = DBUtil.getConnection();
            // 执行
            String sql = "update emp set sal = sal * 10 where job = ?";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "Manager");
            int count = ps.executeUpdate();
            System.out.println("更新了" + count + "条。" );
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
