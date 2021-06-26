package com.aoligei.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
/*        // 1.���غ�ͨ�����������Tomcat��Ҫ��ǰ�û���HttpSession
        // servletRequest.getSession();  ������ΪgetSession()��servletRequest������HttpServletRequest���еķ�����
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        // 2.�ж������û��Ϸ���
        if (session == null) {
            // sendRedirect��servletResponse����HttpServletResponse���еķ���������ҲҪǿת��
            // ((HttpServletResponse) servletResponse).sendRedirect("/my");
            // System.out.println("hahah����");
            request.getRequestDispatcher("/login_error.html").forward(servletRequest, servletResponse);
            return;
        }
        // 3.����
        filterChain.doFilter(servletRequest, servletResponse);*/

        // ��������(���е�¼ҳ��)
        // 1.������������ȡ�������URI���˽��û����ʵ���Դ�ļ���˭��
        HttpSession session = null;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();// [/��վ��/��Դ�ļ�����  /myWeb/login or /myWeb/login.html or]

        // 2. �������������Դ�ļ����¼�йأ���login.html  ���� LoginServlet�� ��ʱӦ�����������С�
        if (requestURI.indexOf("login") != -1 || "/myWeb/".equals(requestURI)) {  // ���ص�ǰ�ַ�����login��һ�γ��ֵ�λ�á�û�з���-1
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        // 3.�������������ʵ���������Դ�ļ�����Ҫ�õ��û��ڷ����HttpSession
        session = request.getSession(false);
        if (session != null) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        // 4. �ܾ�����
        request.getRequestDispatcher("/login_error.html").forward(servletRequest, servletResponse);

    }
}
