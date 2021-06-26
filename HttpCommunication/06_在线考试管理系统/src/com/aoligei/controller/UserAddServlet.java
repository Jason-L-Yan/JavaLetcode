package com.aoligei.controller;

import com.aoligei.dao.UserDao;
import com.aoligei.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

public class UserAddServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName, password, sex, email;
        UserDao dao = new UserDao();
        Users user;
        int result = 0;
        PrintWriter out = null;
        // 1. ������������󡿶�ȡ������ͷ��������Ϣ���õ��û���Ϣ
        userName = request.getParameter("userName");
        password = request.getParameter("password");
        sex = request.getParameter("sex");
        email = request.getParameter("email");
        // 2. ������UserDao�����û���Ϣ��䵽INSERT�������JDBC�淶���͵����ݿ������
        user = new Users(null, userName, password, sex, email);
        Date startDate = new Date();
        result = dao.add(user, request);
        Date endDate = new Date();
        System.out.println("�������ʱ��Ϊ" + (endDate.getTime() - startDate.getTime()) + "����");
        // 3. ��������Ӧ���󡿽������������Զ�������ʽд�뵽��Ӧ����
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red; font-size:40'>�û���Ϣע��ɹ�</font>");
        } else {
            out.print("<font style='color:red; font-size:40'>�û���Ϣע��ʧ��</font>");
        }

    }
        // Tomcat�������١�������󡿺͡���Ӧ����
        // Tomcat����Http��ӦЭ������͵�����������������
        // �����������Ӧͷcontent-typeָ������������Ӧ���������ݱ༭
        // ��������༭����Ľ���ڴ�����չʾ���û�����������
}
