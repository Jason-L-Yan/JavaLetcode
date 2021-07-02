package com.aoligei;

import com.aoligei.domain.Student;
import com.aoligei.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class MyApp2 {
    public static void main(String[] args) {
        //5.获取SqlSession对象，从SqlSessionFactory中获取SqlSession
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        //6.【重要】指定要执行的sql语句的标识。  sql映射文件中的namespace + "." + 标签的id值
        String sqlId = "com.aoligei.dao.StudentDao.selectStudents";
        //7. 重要】执行sql语句，通过sqlId找到语句
        List<Student> studentList = sqlSession.selectList(sqlId);
        //8.输出结果
        studentList.forEach( stu -> System.out.println(stu));  // 重写toString()
        //9.关闭SqlSession对象
        sqlSession.close();
    }

}
