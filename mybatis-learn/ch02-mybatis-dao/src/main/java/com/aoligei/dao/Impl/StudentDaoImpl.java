package com.aoligei.dao.Impl;

import com.aoligei.dao.StudentDao;
import com.aoligei.domain.Student;
import com.aoligei.util.MyBatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentDaoImpl implements StudentDao {
    @Override
    public List<Student> selectStudentss() {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "com.aoligei.dao.StudentDao.selectStudentss";
        List<Student> students = sqlSession.selectList(sqlId);
        // students.forEach(student -> System.out.println(students));
        sqlSession.close();
        return students;
    }

    @Override
    public int insertStudents(Student student) {
        SqlSession sqlSession = MyBatisUtil.getSqlSession();
        String sqlId = "com.aoligei.dao.StudentDao.insertStudents";
        int insert = sqlSession.insert(sqlId, student);
        // students.forEach(student -> System.out.println(students));
        sqlSession.commit();
        sqlSession.close();
        return insert;
    }
}
