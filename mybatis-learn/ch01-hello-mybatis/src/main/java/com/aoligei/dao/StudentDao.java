package com.aoligei.dao;

import com.aoligei.domain.Student;

import java.util.List;

// 操作student的接口
public interface StudentDao {
    // 查询student表的所有数据
    List<Student> selectStudents();

    // 插入方法
    // 参数：student，表示要插入到数据库中的数据
    // 返回值：int，表示执行insert操作后，影响数据库的行数
    int insertStudent(Student student);
}
