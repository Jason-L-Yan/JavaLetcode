package com.aoligei.controller;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("ʵʩ����");
        // ����ת��������
        // 1. ͨ����ǰ�������������Դ�ļ����뱨�����
        RequestDispatcher report = request.getRequestDispatcher("/two");
        // 2. ����������͸�tomcat
        report.forward(request,response);
    }
}
