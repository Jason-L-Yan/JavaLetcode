package com.aoligei.jdbc.learningTest1;
/*
    提示：jdbc中下标皆从 1 开始。
    处理查询结果集
 */
import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) {
        Connection conn = null;  // 连接
        Statement stmt = null;  // 对象
        ResultSet res = null;
        try {
            // 1. 注册驱动
            // 写法一：
            // Driver driver = new com.mysql.jdbc.Driver();
            // DriverManager.registerDriver(driver);
            // 写法二：
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // 2. 获取连接
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // 3. 获取数据库操作对象
            stmt = conn.createStatement();
            // 4. 执行SQL语句
            // JDBC中的sql语句不需要以 “;” 结尾
            String sql = "select empno, ename, sal from emp order by sal desc";
            // int count = stmt.executeUpdate(sql);
            // 执行查询语句是这个方法：executeQuery
            // ResultSet就是查询结果集对象，查询结果都在这个对象当中
            // ResultSet也需要关闭
            res = stmt.executeQuery(sql);
            // 5.处理查询结果集
            /*
            ResultSet中有以下数据：
            +-------+--------+---------+
            | empno | ename  | sal     |
            +-------+--------+---------+
            |  7839 | KING   | 5000.00 |
            |  7788 | SCOTT  | 3000.00 |
            |  7902 | FORD   | 3000.00 |
            |  7566 | JONES  | 2975.00 |
            |  7698 | BLAKE  | 2850.00 |
            |  7782 | CLARK  | 2450.00 |
            |  7499 | ALLEN  | 1600.00 |
            |  7844 | TURNER | 1500.00 |
            |  7934 | MILLER | 1300.00 |
            |  7654 | MARTIN | 1250.00 |
            |  7521 | WARD   | 1250.00 |
            |  7876 | ADAMS  | 1100.00 |
            |  7900 | JAMES  |  950.00 |
            |  7369 | SMITH  |  800.00 |
            +-------+--------+---------+
             */
            while (res.next()) {
//                // boolean has = res.next();  // 光标向前移动一位
//
//                // 条件成立表示光标指向的行有记录
//                // 取当前行的第1个值
//                // getString方法表示不管底层数据库表中是什么类型，统一都以String类型返回。
//                // jdbc中下标皆以 1 开始。
//                String empno = res.getString(1);
//                // 取当前行的第2个值
//                String ename = res.getString(2);
//                // 取当前行的第3个值
//                String sal = res.getString(3);
//                System.out.println(empno + ", " + ename + ", " + sal);


//                // 根据下标来取值的，以特定类型取出
//                int empno = res.getInt(1);
//                String ename = res.getString(2);
//                double sal = res.getDouble(3);
//                // sal是double类型，所以可以进行数值运算
//                System.out.println(empno + "," + ename + "," + (sal + 100));


                // 根据查询结果的列名可以取吗？
                int empno = res.getInt("empno");
                String ename = res.getString("ename");
                double sal = res.getDouble("sal");
                // sal是double类型，所以可以进行数值运算
                System.out.println(empno + "," + ename + "," + (sal + 100));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 先关闭ResultSet（结果集）、再关闭Statement（数据库对象），最后关闭connection（连接对象）
            try {
                if (res != null) {
                    res.close();
                }

                if (conn != null) {
                    conn.close();
                }

                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
