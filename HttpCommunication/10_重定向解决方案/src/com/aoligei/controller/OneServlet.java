package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("OneServlet ���� ϴ�²�");
        // �ض�����������
//        response.sendRedirect("/myWeb/two");  // [��ַ��ʽ��/��վ��/��Դ�ļ���]
        response.sendRedirect("http://www.baidu.com");  // [��ַ��ʽ��/��վ��/��Դ�ļ���]
    }
}
