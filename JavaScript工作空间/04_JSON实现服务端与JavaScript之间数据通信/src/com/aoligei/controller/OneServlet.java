package com.aoligei.controller;

import com.aoligei.entity.Student;
import com.aoligei.util.ReflectUtil;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Student stu = new Student(20, "allen");
        String str = ReflectUtil.jasonObject(stu);
        request.setAttribute("key", str);
        request.getRequestDispatcher("/index_1.jsp").forward(request, response);
    }
}
