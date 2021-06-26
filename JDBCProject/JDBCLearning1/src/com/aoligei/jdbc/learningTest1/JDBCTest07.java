package com.aoligei.jdbc.learningTest1;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;
import java.util.Scanner;
/*
��ô����SQLע�룿
��Ҫԭ���û��ṩ����Ϣ������SQL���ı���

java.sql.Statement�ӿڵ��ص㣺�Ƚ����ַ�����ƴ�ӣ�Ȼ���ٽ���sql���ı��롣
    �ŵ㣺ʹ��Ststement���Խ���SQL����ƴ��
    ȱ�㣺��Ϊƴ�ӵĴ��ڣ����¿��ܸ��������ӻ��ᣬ����SQLע��
java.sql.PreparedStatement�ӿ��ص㣺�Ƚ���SQL�����룬Ȼ���ٽ���SQL��䴫ֵ��
    �ŵ㣺����SQLע��
    ȱ�㣺û�а취����SQL���ƴ�ӣ�ֻ�ܸ�SQL��䴫ֵ��

 */
public class JDBCTest07 {
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
        PreparedStatement stmt = null;
        ResultSet res = null;

        try {
            // ע�����Ӳ���3��4˳�����
            // 1.ע�����ݿ�
            Class.forName(driver);
            // 2.�������ݿ�
            // һ���ʺţ���һ��ռλ����һ��ռλ��ֻ�ܽ���һ����ֵ/���ݡ�
            conn = DriverManager.getConnection(url, user, pwd);
            // 4.��ȡԤ��������ݿ��������
            String sql = "select * from t_user where login_name = ? and login_pwd = ?";
            // 3.��������
            stmt = conn.prepareStatement(sql);  // ��ʱ�ᷢ��sql��DBMS������sql����==����==
            // ��ռλ������ֵ
            // ��ô���SQL���ע������ģ���ʹ�û���Ϣ����SQL�ؼ��֣����ǲ��μӱ����û��
            stmt.setString(1, loginName);  // jdbc�������±��1��ʼ�������һ��ռλ��
            stmt.setString(2, loginPwd);
            // 4.ִ��SQL���
            res = stmt.executeQuery();
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
