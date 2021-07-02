package com.aoligei;

import com.aoligei.dao.Impl.StudentDaoImpl;
import com.aoligei.dao.StudentDao;
import com.aoligei.domain.Student;
import org.junit.Test;

import java.util.List;

public class TestMybatis {
    @Test
    public void testSlectStudent() {
        StudentDao dao = new StudentDaoImpl();
        List<Student> studentList = dao.selectStudentss();
        studentList.forEach(student -> System.out.println(student));

    }

    @Test
    public void testInsertStudent() {
        StudentDao dao = new StudentDaoImpl();
        Student student = new Student();
        student.setId(1007);
        student.setName("孙权");
        student.setEmail("sunquan@163.com");
        student.setAge(12);
        int i = dao.insertStudents(student);
        System.out.println("添加对象的数量:" + i);
    }
}
