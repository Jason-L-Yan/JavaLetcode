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

    // TomCat����ʱ��Ԥ�ȴ���20��Connection����userDao.add����ִ��ʱ��
    // ��ʵ�ִ����õ�Connection����add����
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        JdbcUtil util = new JdbcUtil();
        // �˴��Ǿֲ�����������������������ٿ���ʹ�ã�����Ҫʹ���map��������վ�����ڼ䶼����
        Map map = new HashMap();
        for (int i = 1; i <= 20; i++) {
            Connection con = util.getCon();
            System.out.println("��Http����������ʱ������Connection " + con);
            // true��ʾ���ͨ�����ڿ���״̬��falseͨ�����ڱ�ʹ�á�
            map.put(con, true);
        }
        // Ϊ����Http�����������ڼ䣬һֱ������ʹ��20��Connection����Connection����
        // ��ȫ�����������
        ServletContext application = sce.getServletContext();
        application.setAttribute("key1", map);
    }

    //
    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // �õ�ȫ�����������
        ServletContext application = sce.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            Connection con = (Connection) it.next();
            if (con != null) {
                System.out.println("�ֵ��ǣ���" + con + "����һ����18������ӻ���һ���ú���");
            }
        }
    }
}
