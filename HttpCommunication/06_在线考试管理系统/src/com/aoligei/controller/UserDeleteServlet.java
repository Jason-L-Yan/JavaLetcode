package com.aoligei.controller;

import com.aoligei.dao.UserDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class UserDeleteServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId;
        UserDao dao = new UserDao();
        int result = 0;
        PrintWriter out = null;
        // ���ݳ����ӻ�ȡidɾ��Ԫ�أ�����ʹ�� request��ȡ����
        // 1.[�����������]��ȡ������ͷ���������û���ţ�
        userId = request.getParameter("userId");
        // 2.[����DAO]���û������䵽delete������͵����ݿ��������
        result = dao.delete(userId);
        // 3. [������Ӧ����]���������Զ�����д������Ӧ�壬���������
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if (result == 1) {
            out.print("<font style='color:red; font-size:40'>�û���Ϣɾ���ɹ�</font>");
        } else {
            out.print("<font style='color:red; font-size:40'>�û���Ϣɾ��ʧ��</font>");
        }
    }
}
