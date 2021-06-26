package com.aoligei.controller;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class TwoServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int jiaozi_money = 30;
        int gaifan_money = 15;
        int miantiao_money = 20;
        int money = 0, consume = 0, balance=0;
        String food, userName = null;
        Cookie cookieArray[] = null;
        Cookie newCard = null;
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = response.getWriter();
        food = request.getParameter("food");
        cookieArray = request.getCookies();
//        System.out.println("2�ù�������������������");
        for (Cookie card : cookieArray) {
            String key = card.getName();
//            System.out.println("3�ù�������������������");
//            System.out.println(key);
            String value = card.getValue();
//            System.out.println(value);
            if ("userName".equals(key)) {
                userName = value;
            } else if ("money".equals(key)) {
                money = Integer.valueOf(value);
                if ("����".equals(food)) {
                    if (jiaozi_money > money) {
                        out.print("�û�" + userName + "���㣬���ֵ");
                    } else {
                        newCard = new Cookie("money", (money - jiaozi_money) + "");
                        consume = jiaozi_money;
                        balance = money - jiaozi_money;
                    }
                } else if ("����".equals(food)) {
                    if (miantiao_money > money) {
                        out.print("�û�" + userName + "���㣬���ֵ");
                    } else {
                        newCard = new Cookie("money", (money - miantiao_money) + "");
                        consume = miantiao_money;
                        balance = money - miantiao_money;
                    }
                } else if ("�Ƿ�".equals(food)) {
                    if (gaifan_money > money) {
                        out.print("�û�" + userName + "���㣬���ֵ");
                    } else {
                        newCard = new Cookie("money", (money - gaifan_money) + "");
                        consume = gaifan_money;
                        balance = money - gaifan_money;
                    }
                }
            }
        }
        //4.���û���Ա���������û�
        response.addCookie(newCard);
        //5.�����Ѽ�¼д�뵽��Ӧ
        out.print("�û� " + userName + "�������� " + consume + " ��� :" + balance);
    }
}
