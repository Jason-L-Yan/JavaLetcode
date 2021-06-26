package com.aoligei.jdbc.learningTest1;

import java.sql.*;

/*
JDBC默认情况下对事物怎么处理？
    模拟一下银行卡账户操作，A账户向B账户转账10000元
    从A账户减去10000，向B账户加上10000
    必须同时成功，或者同时失败

    转账需要执行两条Update语句

JDBC默认情况下自动提交：
    什么是自动提交？
        只要执行一条DML语句就自动提交一次

在实际开发中必须将JDBC的自动提交机制关闭掉，改成手动提交
当一个完整的事务结束之后，再提交
    conn.setAutoCommit(false);  // 关闭自动提交
    conn.commit();  // 手动提交
    conn.rollback();  // 手动回滚

 */
public class JDBCTest11 {
    public static void main(String[] args) {


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // 开启事务：将自动提交机制关闭掉
            conn.setAutoCommit(false);
            String sql = "update t_act set balance = ? where actno = ? ";  // 这种写法报错，
            ps = conn.prepareStatement(sql);
            // 给？传值
            ps.setDouble(1, 10000);
            ps.setString(2, "A");
            int count = ps.executeUpdate();  // 更新成功之后表示更新1条， 返回1

            // 模拟异常！！！
            String s = null;
            // 出现空指针异常，下面的语句不执行，转账有问题, 钱转丢了
            s.toString();
            //Thread.sleep(1000 * 20);

            // 给？传值
            ps.setDouble(1, 10000);
            ps.setString(2, "B");
            count += ps.executeUpdate();  // 更新成功之后表示更新1条， 再返回1
            System.out.println(count == 2 ? "转账成功" : "转账失败");
            // 代码执行到此处，说明以上代码没有出现任何异常，表示都成功了，手动提交，事务结束。
            conn.commit();
        } catch (Exception e) {
            // 出现异常的话，为了保险起见，这里要回滚
            if (conn != null) {
                try {
                    conn.rollback();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
            e.printStackTrace();
        }  finally {

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
