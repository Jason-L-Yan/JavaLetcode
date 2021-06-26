package com.aoligei.controller;
/**
 * 子类----》父类-----》A接口
 * 此时，子类也是A接口的实现类
 *
 * 抽象类作用:降低接口实现类对接口实现过程难度
 * 将接口中不需要使用抽象方法教给抽象类进行完成
 * 这样接口实现类只需要对接口需要方法进行重写
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送Get请求方式处理");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet类针对浏览器发送Post请求方式处理");
    }
}
