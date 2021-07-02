package com.aoligei.dao;

import com.aoligei.domain.Student;

import java.util.List;

public interface StudentDao {
    List<Student> selectStudentss();

    int insertStudents(Student student);
}
