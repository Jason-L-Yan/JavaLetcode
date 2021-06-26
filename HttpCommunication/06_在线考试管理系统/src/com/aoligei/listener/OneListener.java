package com.aoligei.listener;

import com.aoligei.util.JdbcUtil;
//import com.mysql.jdbc.Connection;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.Connection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class OneListener implements ServletContextListener {

    // TomCat启动时，预先创建20个Connection，在userDao.add方法执行时，
    // 将实现创建好的Connection交给add方法
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        JdbcUtil util = new JdbcUtil();
        // 此处是局部变量，脱离这个方法将不再可以使用，必须要使这个map在整个网站运行期间都活着
        Map map = new HashMap();
        for (int i = 1; i <= 20; i++) {
            Connection con = util.getCon();
            System.out.println("在Http服务器启动时，创建Connection " + con);
            // true表示这个通道处于空闲状态，false通道正在被使用。
            map.put(con, true);
        }
        // 为了在Http服务器运行期间，一直都可以使用20个Connection，将Connection保存
        // 到全局作用域对象
        ServletContext application = sce.getServletContext();
        application.setAttribute("key1", map);
    }

    //
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // 拿到全局作用域对象
        ServletContext application = sce.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Connection con = (Connection) it.next();
            if (con != null) {
                System.out.println("兄弟们，我" + con + "先行一步。18年后老子还是一条好汉。");
            }
        }
    }
}
