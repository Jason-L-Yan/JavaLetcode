package com.aoligei.controller;

import com.aoligei.dao.UserDao;
import com.aoligei.entity.Users;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class UserFindServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        PrintWriter out;
        // ��Ҫ��ǰ�û��ڷ����HttpSession
        // ��ǰ�û��й��ӣ��ѹ��ӷ��أ����û�У�����Ϊ����������Ϊ����Ϊfalse������null
//        HttpSession session = request.getSession(false);
//        if (session == null) {
//            response.sendRedirect("/myWeb/login_error.html");
//            return;
//        }
        // [����DAO]����ѯ�������͵����ݿ�������ϣ��õ������û���Ϣ��List��
        List<Users> userList = dao.findAll();
        // [������Ӧ����]���û���Ϣ���<table>��ǩ�����Զ�������ʽд�뵽��Ӧ���С�
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        out.print("<table border='2' align='center'>");
        out.print("<tr>");
        out.print("<td>�û���ţ�</td>");
        out.print("<td>�û�������</td>");
        out.print("<td>�û����룺</td>");
        out.print("<td>�û��Ա�</td>");
        out.print("<td>�û����䣺</td>");
        out.print("<td>������</td>");

        out.print("</tr>");
        for (Users users : userList) {
            out.print("<tr>");
            out.print("<td>" + users.getUserId() + "</td>");
            out.print("<td>" + users.getUserName() + "</td>");
            out.print("<td>******</td>");
            out.print("<td>" + users.getSex() + "</td>");
            out.print("<td>" + users.getEmail() + "</td>");
            out.print("<td><a href='/myWeb/user/delete?userId=" + users.getUserId() + "'>ɾ���û�</a></td>");
            out.print("</tr>");

        }
        out.print("</table>");
    }
}
