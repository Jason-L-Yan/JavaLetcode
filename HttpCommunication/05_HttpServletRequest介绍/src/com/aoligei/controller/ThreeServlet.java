package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThreeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // �������еĽ����ɶ�����ɣ����ö�ŷ���弯���룬
        // ��Ҫ�޸ĳ�utf-8��֧�����ġ�
        request.setCharacterEncoding("utf-8");
        String value = request.getParameter("userName");
        System.out.println("��������õ��Ĳ���ֵ��" + value);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        // ����ͷ�еĽ�����TomCat���룬����utf-8����
        System.out.println("������ͷ�õ��Ĳ���ֵ��" + userName);
    }
}
