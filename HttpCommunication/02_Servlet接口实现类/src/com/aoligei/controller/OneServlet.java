package com.aoligei.controller;
/**
 * ����----������-----��A�ӿ�
 * ��ʱ������Ҳ��A�ӿڵ�ʵ����
 *
 * ����������:���ͽӿ�ʵ����Խӿ�ʵ�ֹ����Ѷ�
 * ���ӿ��в���Ҫʹ�ó��󷽷��̸�������������
 * �����ӿ�ʵ����ֻ��Ҫ�Խӿ���Ҫ����������д
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class OneServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet��������������Get����ʽ����");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("OneServlet��������������Post����ʽ����");
    }
}
