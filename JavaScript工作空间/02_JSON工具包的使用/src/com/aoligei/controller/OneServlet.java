package com.aoligei.controller;

import com.aoligei.entity.Dept;
import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.得到一个部门类型的对象。
        Dept dept = new Dept(10, "人寿社保事业部", "北京");
        // 2.通过lib工具包中工具类将Dept对象中内容转换为JSON格式字符串
        JSONObject jsonObject = JSONObject.fromObject(dept);
        // 3.将json格式字符串添加到请求作用域对象
        request.setAttribute("key", jsonObject.toString());
        request.getRequestDispatcher("/index_1.jsp").forward(request, response);

    }
}
