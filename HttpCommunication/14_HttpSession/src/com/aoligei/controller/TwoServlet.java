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
        // 2.将session中所有key读取出来，存放一个枚举对象。
        Enumeration<String> goodsNames = session.getAttributeNames();
        while (goodsNames.hasMoreElements()) {
            String goodsName = goodsNames.nextElement();
            int goodsNum = (int)session.getAttribute(goodsName);
            System.out.println("商品名称 " + goodsName + "商品数量 " + goodsNum);
        }
    }
}
