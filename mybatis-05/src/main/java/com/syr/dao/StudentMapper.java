package com.syr.dao;

import com.syr.pojo.Student;

import java.util.List;

/**
 * @author syr
 * @date 2022/2/18 - 15:46
 */
public interface StudentMapper {
    //查询所有学生的信息，以及对应的老师的信息
    public List<Student> getStudent();
    public List<Student> getStudent2();
}
