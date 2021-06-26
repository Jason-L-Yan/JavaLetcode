package com.aoligei.jdbc.learningTest1;

import com.aoligei.jdbc.learningTest1.utils.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/*
在当前事务中对job='NMANAGER'的记录进行查询并锁定，使用行级锁机制。
 */
public class JDBCTest13 {
    public static void main(String[] args) {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            // 获取连接
            conn = DBUtil.getConnection();
            // 开启事务
            conn.setAutoCommit(false);
            // 执行
            String sql = "select ename, sal from emp where job = ? for update";
            ps = conn.prepareStatement(sql);
            ps.setString(1, "Manager");
            res = ps.executeQuery();
            while (res.next()) {
                System.out.println(res.getString("ename") + "," +res.getDouble("sal"));
            }
            // 睡眠
            Thread.sleep(1000 * 20);
            conn.commit();
        } catch (SQLException throwables) {
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
            throwables.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, res);
        }
    }
}
