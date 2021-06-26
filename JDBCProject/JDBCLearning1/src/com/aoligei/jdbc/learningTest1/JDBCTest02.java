package com.aoligei.jdbc.learningTest1;
/*
    ��ʾ��jdbc���±�Դ� 1 ��ʼ��
    �����ѯ�����
 */
import java.sql.*;

public class JDBCTest02 {
    public static void main(String[] args) {
        Connection conn = null;  // ����
        Statement stmt = null;  // ����
        ResultSet res = null;
        try {
            // 1. ע������
            // д��һ��
            // Driver driver = new com.mysql.jdbc.Driver();
            // DriverManager.registerDriver(driver);
            // д������
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            // 2. ��ȡ����
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // 3. ��ȡ���ݿ��������
            stmt = conn.createStatement();
            // 4. ִ��SQL���
            // JDBC�е�sql��䲻��Ҫ�� ��;�� ��β
            String sql = "select empno, ename, sal from emp order by sal desc";
            // int count = stmt.executeUpdate(sql);
            // ִ�в�ѯ��������������executeQuery
            // ResultSet���ǲ�ѯ��������󣬲�ѯ����������������
            // ResultSetҲ��Ҫ�ر�
            res = stmt.executeQuery(sql);
            // 5.�����ѯ�����
            /*
            ResultSet�����������ݣ�
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
//                // boolean has = res.next();  // �����ǰ�ƶ�һλ
//
//                // ����������ʾ���ָ������м�¼
//                // ȡ��ǰ�еĵ�1��ֵ
//                // getString������ʾ���ܵײ����ݿ������ʲô���ͣ�ͳһ����String���ͷ��ء�
//                // jdbc���±���� 1 ��ʼ��
//                String empno = res.getString(1);
//                // ȡ��ǰ�еĵ�2��ֵ
//                String ename = res.getString(2);
//                // ȡ��ǰ�еĵ�3��ֵ
//                String sal = res.getString(3);
//                System.out.println(empno + ", " + ename + ", " + sal);


//                // �����±���ȡֵ�ģ����ض�����ȡ��
//                int empno = res.getInt(1);
//                String ename = res.getString(2);
//                double sal = res.getDouble(3);
//                // sal��double���ͣ����Կ��Խ�����ֵ����
//                System.out.println(empno + "," + ename + "," + (sal + 100));


                // ���ݲ�ѯ�������������ȡ��
                int empno = res.getInt("empno");
                String ename = res.getString("ename");
                double sal = res.getDouble("sal");
                // sal��double���ͣ����Կ��Խ�����ֵ����
                System.out.println(empno + "," + ename + "," + (sal + 100));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // �ȹر�ResultSet������������ٹر�Statement�����ݿ���󣩣����ر�connection�����Ӷ���
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
