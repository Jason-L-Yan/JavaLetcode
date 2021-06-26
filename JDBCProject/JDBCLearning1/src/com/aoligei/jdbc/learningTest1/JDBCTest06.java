package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;

/*
1. ģ���û���¼

2. ��sc.next()�ĳ�sc.nextLine()֮��
�û�����fdsa
���룺fdsa' or '1'='1
select * from t_user where login_name = 'fdsa' and login_pwd = 'fdsa' or '1'='1'
��¼�ɹ���
������������һ���û��������룬��¼�ɹ��ˣ��������󱻳�ΪSQLע������

3. ����SQLע��ĸ���ԭ����ɶ����ô���
�û��ṩ����Ϣ������SQL���ı���
��Ҫ���أ�����������Ƚ��е��ַ���ƴ�ӣ�Ȼ����ִ��SQL���ı��룬���ñ�ע�롣

 */
public class JDBCTest06 {
    public static void main(String[] args) {

        // ��ʼ��һ�����棬�������û��������������
        Map<String, String> uesrLoginInfo = initUI();

        // �������ݿ���֤�û����������Ƿ���ȷ
        Boolean ok = checkNameandPwd(uesrLoginInfo.get("loginName"), uesrLoginInfo.get("loginPwd"));
        System.out.println(ok ? "��¼�ɹ���" : "��¼ʧ�ܣ�");
    }

    /**
     * ��֤�û���������
     * @param loginName ��¼��
     * @param loginPwd  ����
     * @return  true��ʾ��¼�ɹ���false��ʾ��¼ʧ��
     */
    private static Boolean checkNameandPwd(String loginName, String loginPwd) {
        Boolean ok = false;
        ResourceBundle bundle = ResourceBundle.getBundle("resources/db");
        String driver = bundle.getString("driver");
        String url = bundle.getString("url");
        String user = bundle.getString("user");
        String pwd = bundle.getString("password");
        Connection conn = null;
        Statement stmt = null;
        ResultSet res = null;

        try {
            // ע�����ݿ�
            Class.forName(driver);
            // �������ݿ�
            conn = DriverManager.getConnection(url, user, pwd);
            // ��������
            stmt = conn.createStatement();
            // ����һ��
            // ִ��SQL���
//            res = stmt.executeQuery("select login_name, login_pwd, real_name from t_user");
//            // �����ѯ���ݼ�
//            while (res.next()) {
//                if ((res.getString("login_name").equals(loginName)) && (res.getString("login_pwd").equals(loginPwd))) {
//                    return true;
//                }
//
//            }

            // ��������
            // ʹ�ø�sql��䲻��Ҫʹ��whileѭ��
            String sql = "select * from t_user where login_name = '" + loginName + "' and login_pwd = '" + loginPwd + "'";
            System.out.println(sql);
            // �������sql������û�����������ȷ����ô��������Ҳ�Ͳ�ѯ��һ����¼���������²���Ҫwhileѭ��
            res = stmt.executeQuery(sql);
            if (res.next()) {
                ok = true;
            }

            return ok;


        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // �ͷ���Դ
            try {
                if (res != null) {
                    res.close();
                }
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
        return false;
    }

    private static Map<String, String> initUI() {
        // ��ʼ��һ�����棬�������û��������������
        System.out.print("�û�����");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.print("���룺");
        String pwd = sc.nextLine();
        Map<String, String> userLoginInfo = new HashMap<>();
        userLoginInfo.put("loginName", name);
        userLoginInfo.put("loginPwd", pwd);
        return userLoginInfo;
    }
}
