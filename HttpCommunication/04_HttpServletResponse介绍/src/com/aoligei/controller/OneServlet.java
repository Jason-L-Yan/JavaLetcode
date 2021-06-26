package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "Hello World";  // 执行结果。
        PrintWriter out = response.getWriter();
        out.write(result);  // 以二进制形式写入到响应体中。
    }  // doGet执行完毕
    // TomCat将响应包推送给浏览器


}
