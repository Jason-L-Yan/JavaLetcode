package com.aoligei.jdbc.learningTest1;

import java.sql.*;

/*
JDBCĬ������¶�������ô����
    ģ��һ�����п��˻�������A�˻���B�˻�ת��10000Ԫ
    ��A�˻���ȥ10000����B�˻�����10000
    ����ͬʱ�ɹ�������ͬʱʧ��

    ת����Ҫִ������Update���

JDBCĬ��������Զ��ύ��
    ʲô���Զ��ύ��
        ֻҪִ��һ��DML�����Զ��ύһ��

��ʵ�ʿ����б��뽫JDBC���Զ��ύ���ƹرյ����ĳ��ֶ��ύ
��һ���������������֮�����ύ
    conn.setAutoCommit(false);  // �ر��Զ��ύ
    conn.commit();  // �ֶ��ύ
    conn.rollback();  // �ֶ��ع�

 */
public class JDBCTest11 {
    public static void main(String[] args) {


        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet res = null;

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
            // �������񣺽��Զ��ύ���ƹرյ�
            conn.setAutoCommit(false);
            String sql = "update t_act set balance = ? where actno = ? ";  // ����д������
            ps = conn.prepareStatement(sql);
            // ������ֵ
            ps.setDouble(1, 10000);
            ps.setString(2, "A");
            int count = ps.executeUpdate();  // ���³ɹ�֮���ʾ����1���� ����1

            // ģ���쳣������
            String s = null;
            // ���ֿ�ָ���쳣���������䲻ִ�У�ת��������, Ǯת����
            s.toString();
            //Thread.sleep(1000 * 20);

            // ������ֵ
            ps.setDouble(1, 10000);
            ps.setString(2, "B");
            count += ps.executeUpdate();  // ���³ɹ�֮���ʾ����1���� �ٷ���1
            System.out.println(count == 2 ? "ת�˳ɹ�" : "ת��ʧ��");
            // ����ִ�е��˴���˵�����ϴ���û�г����κ��쳣����ʾ���ɹ��ˣ��ֶ��ύ�����������
            conn.commit();
        } catch (Exception e) {
            // �����쳣�Ļ���Ϊ�˱������������Ҫ�ع�
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
