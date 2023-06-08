package com.example.lap6.service;


import com.example.lap6.model.Student;
import com.example.lap6.repositorys.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void save(Student student) {
        this.studentRepository.save(student);
    }
    public List<Student> listAllStudents() {
        return studentRepository.findAll();
    }
    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }
}
