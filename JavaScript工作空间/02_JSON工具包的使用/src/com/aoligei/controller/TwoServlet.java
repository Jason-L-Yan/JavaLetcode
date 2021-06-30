package com.aoligei.controller;

import com.aoligei.entity.Dept;
import net.sf.json.JSONArray;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TwoServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1. 获得一个集合存放部门对象
        Dept dept1 = new Dept(10, "社保事业部", "大兴区");
        Dept dept2 = new Dept(20, "金融事业部", "顺义区");
        Dept dept3 = new Dept(30, "公共关系事业部", "平谷区");

        List deptList = new ArrayList();
        deptList.add(dept1);
        deptList.add(dept2);
        deptList.add(dept3);

        // 2. 通过json.jar工具类将集合内容转换为【json数组格式】字符串
        JSONArray jsonArray = JSONArray.fromObject(deptList);
        // 3. 将【json数组格式】字符串添加到请求作用域request
        request.setAttribute("key", jsonArray.toString());
        request.getRequestDispatcher("/index_2.jsp").forward(request, response);
    }
}
