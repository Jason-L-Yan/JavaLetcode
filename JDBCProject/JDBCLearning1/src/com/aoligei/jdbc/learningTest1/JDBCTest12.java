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
            // 获取连接
            conn = DBUtil.getConnection();
            // 获取预编译的数据库操作对象
            String sql = "select ename, sal from emp where ename like ?";
            ps = conn.prepareStatement(sql);
            // 给？传值
            ps.setString(1,"A%");
            res = ps.executeQuery();
            while (res.next()) {
                System.out.println(res.getString("ename") + "," + res.getDouble("sal"));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            DBUtil.close(conn, ps, res);
            // 如果没有结果集对象，调用这个方法的时候第三个参数传null。
            // DBUtil.close(conn, ps, null);
        }
    }
}
