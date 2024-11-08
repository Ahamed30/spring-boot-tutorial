package com.demo.cruddemo.dao;

import com.demo.cruddemo.entity.Student;

import java.util.List;

public interface StudentDAO {
    void save(Student student);

    Student findStudentById(Integer studentId);

    List<Student> findAll();

    List<Student> findStudentsByLastName(String lastName);
}
