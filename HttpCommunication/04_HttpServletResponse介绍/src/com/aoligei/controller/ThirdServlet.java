package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ThirdServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = "Java<br/>Mysql<br/>HTML<br/>";
        String result2 = "∫Ï…’≈≈π«<br/>√∑≤À÷‚◊”<br/>Ã«¥◊¿Ôºπ<br/>≈©º“–°≥¥»‚<br/>";
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        out.print(result);
        out.print(result2);
    }
}
