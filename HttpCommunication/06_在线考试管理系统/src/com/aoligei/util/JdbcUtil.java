package com.aoligei.util;

//import java.sql.*;
//
///**
// *  将JDBC规范下相关对象【创建】与【销毁功能】封装到方法
// *
// *   一。JDBC开发步骤：
// *      1.注册数据库服务器提供的Driver接口实现类
// *      2.创建一个连接通道交给Connection接口的实例对象【JDBC4Connection】管理
// *      3.创建一个交通工具交给PreparedStatement接口的实例对象【JDBC4PreparedStatement】管理
// *      4.由交通工具在Java工程与数据库服务器之间进行传输，推送SQL命令并带回执行结果
// *      5.交易结束后，销毁相关资源【Connection,PreparedStatement,ResultSet】
// */
//public class JdbcUtil {
//
//    private  Connection con = null;//类文件属性，可以在类文件中所有的方法中使用
//    private  PreparedStatement ps=null;//类文件属性，可以在类文件中所有的方法中使用
//
//    //静态语句块 static{}
//    //在当前类文件第一次被加载到JVM时，JVM将会自动调用当前类文件静态语句块
//    static{
//        //1.注册数据库服务器提供的Driver接口实现类
//
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        System.out.println("Driver接口实现类被注册了");
//    }
//
//    //封装Connection对象创建细节 不需要考虑使用对象创建细节
//    public  Connection  createCon(){
//        try {
//            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bjpowernode", "root", "5555");
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println("Connection对象创建失败。。。。。");
//        }
//        return con;
//    }
//
//    //封装PreparedStatement对象创建细节
//    public PreparedStatement createStatement(String sql){
//
//        Connection con = createCon();
//        try {
//            ps = con.prepareStatement(sql);
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//        return ps;
//    }
//
//    //封装PreparedStatement对象与Connection对象销毁细节
//    public void close(){
//        if(ps!=null){
//            try {
//                ps.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        if(con!=null){
//            try {
//                con.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//    }
//    //封装PreparedStatement对象与Connection对象与ResultSet对象销毁细节
//    public void close(ResultSet rs){
//        if(rs!=null){
//            try {
//                rs.close();
//            } catch (SQLException e) {
//                e.printStackTrace();
//            }
//        }
//        close();
//
//    }
//}

import jdk.jfr.Frequency;

import javax.servlet.Servlet;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.swing.text.html.HTMLDocument;
import java.sql.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

// JdbcUtil obj = new JdbcUtil();  obj.getCon()
// JdbcUtil obj = new JdbcUtil();  obj.createStatement();
// JdbcUtil.getCon();
public class JdbcUtil {

    final String URL="jdbc:mysql://localhost:3306/bjpowernode";
    final String USERNAME="root";
    final String PASSWORD="5555";
    PreparedStatement ps= null;
    Connection con = null;



    //将jar包中driver实现类加载到JVM中
    static{
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //封装连接通道创建细节
    public Connection getCon(){

        try {
            con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return con;
    }

    // -------（重载）-----通过全局作用域对象得到Connection-------start
    public Connection getCon(HttpServletRequest request) {
        // 1. 通过请求对象，得到全局作用域对象
        ServletContext application = request.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        Iterator it = map.keySet().iterator();
        while (it.hasNext()) {
            con = (Connection) it.next();
            boolean flag = (boolean) map.get(con);
            if (flag == true) {
                map.put(con, false);
                break;
            }
        }
        return con;
    }
    // -----重载-------通过全局作用域对象得到Connection-------start
    public  PreparedStatement createStatement(String sql, HttpServletRequest request){

        try {
            ps =  getCon(request).prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    // ----重载---------------------------
    public  void close(HttpServletRequest request){
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        ServletContext application = request.getServletContext();
        Map map = (Map) application.getAttribute("key1");
        map.put(con, true);
    }

    //封装交通工具创建细节
    public  PreparedStatement createStatement(String sql){

        try {
            ps =  getCon().prepareStatement(sql);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ps;
    }
    // ps与con销毁细节 insert,update,delete
    public  void close(){
        if(ps!=null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(con!=null){
            try {
                con.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }

    //select ps,con,rs
    public  void close(ResultSet rs){
        if(rs!=null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        close();
    }
}

