package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "Hello World";  // ִ�н����
        PrintWriter out = response.getWriter();
        out.write(result);  // �Զ�������ʽд�뵽��Ӧ���С�
    }  // doGetִ�����
    // TomCat����Ӧ�����͸������


}
