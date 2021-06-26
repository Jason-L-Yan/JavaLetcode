package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class ThreeServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 请求体中的解码由对象完成，采用东欧字体集解码，
        // 需要修改成utf-8来支持中文。
        request.setCharacterEncoding("utf-8");
        String value = request.getParameter("userName");
        System.out.println("从请求体得到的参数值：" + value);

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userName = request.getParameter("userName");
        // 请求头中的解码由TomCat解码，采用utf-8解码
        System.out.println("从请求头得到的参数值：" + userName);
    }
}
