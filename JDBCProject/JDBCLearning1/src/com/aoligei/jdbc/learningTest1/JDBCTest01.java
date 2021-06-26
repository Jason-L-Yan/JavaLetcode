package com.aoligei.jdbc.learningTest1;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. 注册驱动
            // com.mysql.jdbc.Driver是mysql数据库厂家写的，实现了java.sql.Driver接口
            // 如果是oracle数据库的话，类名就不一样了: oracle.jdbc.driver.oracleDriver
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            Driver driver1 = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver1);

            // 2.获取数据库连接
            /*
            什么是URL?
                统一资源定位符
            任何一个URL都包括:
		        协议+IP地址+端口号port+资源名
                http://192.168.100.2:8888/abc
            协议:
?		        是一个提前规定好的数据传输格式。通信协议有很多: http. https.. . . .
                在传送数据之前,提前先商量好数据传送的格式。
                这样对方接收到数据之后，就会按照这个格式去解析，拿到有价值的数据。
            IP地址:
?		        网络当中定位某台计算机的。
            PORT端口号:
?		        定位这台计算机上某个服务的。
            资源名:
?		        这个服务下的某个资源。
            jdbc : mysql://		这是java程序和mysql通信的协议。
            localhost				这是本机IP地址,本机IP地址还可以写成:127.0.0.1
            3306					  mysql数据库端口号
            bjpowernode         mysql数据库的名称
            jdbc:mysql : //192.168.111.123:3306/ abc
            如果是oracle数据库的话:
		        oracle:jdbc:thin:@localhost:1521:bjpowernode
                oracle:jdbc:thin:@		这是oracle和java的通信协议
?		        localhost					  这是本机.IP地址。
?		        1521							oracle默认端口
            localhost和127.0.0.1都是本机IP地址。死记硬背。
            */
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String password = "5555";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            // 输出连接对象的内存地址
            // com.mysql.jdbc.JDBC4Connection@19bb089b

            // 3. 获取数据库操作对象
            // 通过一个连接对象Connection是可以创建多个Statement对象的。
            stmt = conn.createStatement();
            // System.out.println(stmt);
            // Statement stmt2 = conn.createStatement();
            // System.out.println(stmt2);

            // 4. 执行SQL语句
            //String sql = "insert into dept (deptno, dname, loc) values (50, '销售部', '北京')";
            // Statement接口中的executeUpdate方法专门来执行DML语句的。
            // 该方法的返回值表示:影响了数据库表中的总记录条数!
            //int count = stmt.executeUpdate(sql);  // 可以执行增删改查
            //System.out.println(count);  // 1

            //String updateSql = "update dept set dname = '人事部', loc = '天津' where deptno = 50";
            //int count2 = stmt.executeUpdate(updateSql);  // 可以执行增删改查
            //System.out.println(count2);  // 1

            String deleteSql = "delete from dept where deptno = 50";
            int count3 = stmt.executeUpdate(deleteSql);
            System.out.println(count3);

            // 5.
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 6. 先释放Statement,再释放Connection
            // 分别 try...catch
            // 放到 finall 中关闭
            try {
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
