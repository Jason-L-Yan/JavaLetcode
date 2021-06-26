package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Enumeration;

public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        // 2.��session������key��ȡ���������һ��ö�ٶ���
        Enumeration<String> goodsNames = session.getAttributeNames();
        while (goodsNames.hasMoreElements()) {
            String goodsName = goodsNames.nextElement();
            int goodsNum = (int)session.getAttribute(goodsName);
            System.out.println("��Ʒ���� " + goodsName + "��Ʒ���� " + goodsNum);
        }
    }
}
