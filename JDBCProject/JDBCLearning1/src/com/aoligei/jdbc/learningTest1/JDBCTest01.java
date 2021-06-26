package com.aoligei.jdbc.learningTest1;

import java.sql.*;

public class JDBCTest01 {
    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            // 1. ע������
            // com.mysql.jdbc.Driver��mysql���ݿ⳧��д�ģ�ʵ����java.sql.Driver�ӿ�
            // �����oracle���ݿ�Ļ��������Ͳ�һ����: oracle.jdbc.driver.oracleDriver
            // com.mysql.jdbc.Driver driver = new com.mysql.jdbc.Driver();
            Driver driver1 = new com.mysql.jdbc.Driver();
            DriverManager.registerDriver(driver1);

            // 2.��ȡ���ݿ�����
            /*
            ʲô��URL?
                ͳһ��Դ��λ��
            �κ�һ��URL������:
		        Э��+IP��ַ+�˿ں�port+��Դ��
                http://192.168.100.2:8888/abc
            Э��:
?		        ��һ����ǰ�涨�õ����ݴ����ʽ��ͨ��Э���кܶ�: http. https.. . . .
                �ڴ�������֮ǰ,��ǰ�����������ݴ��͵ĸ�ʽ��
                �����Է����յ�����֮�󣬾ͻᰴ�������ʽȥ�������õ��м�ֵ�����ݡ�
            IP��ַ:
?		        ���統�ж�λĳ̨������ġ�
            PORT�˿ں�:
?		        ��λ��̨�������ĳ������ġ�
            ��Դ��:
?		        ��������µ�ĳ����Դ��
            jdbc : mysql://		����java�����mysqlͨ�ŵ�Э�顣
            localhost				���Ǳ���IP��ַ,����IP��ַ������д��:127.0.0.1
            3306					  mysql���ݿ�˿ں�
            bjpowernode         mysql���ݿ������
            jdbc:mysql : //192.168.111.123:3306/ abc
            �����oracle���ݿ�Ļ�:
		        oracle:jdbc:thin:@localhost:1521:bjpowernode
                oracle:jdbc:thin:@		����oracle��java��ͨ��Э��
?		        localhost					  ���Ǳ���.IP��ַ��
?		        1521							oracleĬ�϶˿�
            localhost��127.0.0.1���Ǳ���IP��ַ������Ӳ����
            */
            String url = "jdbc:mysql://localhost:3306/bjpowernode";
            String user = "root";
            String password = "5555";
            conn = DriverManager.getConnection(url, user, password);
            System.out.println(conn);
            // ������Ӷ�����ڴ��ַ
            // com.mysql.jdbc.JDBC4Connection@19bb089b

            // 3. ��ȡ���ݿ��������
            // ͨ��һ�����Ӷ���Connection�ǿ��Դ������Statement����ġ�
            stmt = conn.createStatement();
            // System.out.println(stmt);
            // Statement stmt2 = conn.createStatement();
            // System.out.println(stmt2);

            // 4. ִ��SQL���
            //String sql = "insert into dept (deptno, dname, loc) values (50, '���۲�', '����')";
            // Statement�ӿ��е�executeUpdate����ר����ִ��DML���ġ�
            // �÷����ķ���ֵ��ʾ:Ӱ�������ݿ���е��ܼ�¼����!
            //int count = stmt.executeUpdate(sql);  // ����ִ����ɾ�Ĳ�
            //System.out.println(count);  // 1

            //String updateSql = "update dept set dname = '���²�', loc = '���' where deptno = 50";
            //int count2 = stmt.executeUpdate(updateSql);  // ����ִ����ɾ�Ĳ�
            //System.out.println(count2);  // 1

            String deleteSql = "delete from dept where deptno = 50";
            int count3 = stmt.executeUpdate(deleteSql);
            System.out.println(count3);

            // 5.
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // 6. ���ͷ�Statement,���ͷ�Connection
            // �ֱ� try...catch
            // �ŵ� finall �йر�
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
