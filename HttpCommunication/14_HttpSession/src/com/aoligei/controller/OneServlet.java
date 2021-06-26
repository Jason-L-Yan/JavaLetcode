package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String goodsName;
        goodsName = request.getParameter("goodsName");
        HttpSession session = request.getSession();
        Integer goodsNum = (Integer) session.getAttribute(goodsName);
        if (goodsNum == null) {
            session.setAttribute(goodsName, 1);
        } else {
            session.setAttribute(goodsName, goodsNum + 1);
        }
    }
}
