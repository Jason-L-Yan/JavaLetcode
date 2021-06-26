package com.aoligei.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class OneFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
/*        // 1.拦截后，通过请求对象向Tomcat索要当前用户的HttpSession
        // servletRequest.getSession();  报错，因为getSession()是servletRequest的子类HttpServletRequest特有的方法。
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        // HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        // 2.判断来访用户合法性
        if (session == null) {
            // sendRedirect是servletResponse子类HttpServletResponse特有的方法，所以也要强转。
            // ((HttpServletResponse) servletResponse).sendRedirect("/my");
            // System.out.println("hahah测试");
            request.getRequestDispatcher("/login_error.html").forward(servletRequest, servletResponse);
            return;
        }
        // 3.放行
        filterChain.doFilter(servletRequest, servletResponse);*/

        // 方案二：(放行登录页面)
        // 1.调用请求对象读取请求包中URI，了解用户访问的资源文件是谁？
        HttpSession session = null;
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String requestURI = request.getRequestURI();// [/网站名/资源文件名称  /myWeb/login or /myWeb/login.html or]

        // 2. 如果本次请求资源文件与登录有关，【login.html  或者 LoginServlet】 此时应给无条件放行。
        if (requestURI.indexOf("login") != -1 || "/myWeb/".equals(requestURI)) {  // 返回当前字符串中login第一次出现的位置。没有返回-1
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        // 3.如果本次请求访问的是其他资源文件，需要得到用户在服务端HttpSession
        session = request.getSession(false);
        if (session != null) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }
        // 4. 拒绝请求
        request.getRequestDispatcher("/login_error.html").forward(servletRequest, servletResponse);

    }
}
