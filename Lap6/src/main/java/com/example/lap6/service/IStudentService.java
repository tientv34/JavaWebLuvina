package com.example.lap6.service;


import com.example.lap6.model.Student;

import java.util.List;

public interface IStudentService {
    void save(Student student);
    Student findById(Long id);
    public List<Student> listAllStudents();
}
