package com.example.lap6.controller;

import com.example.lap6.model.Course;
import com.example.lap6.model.Student;
import com.example.lap6.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
public class StudentController {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/registStudentToCourse")
    public void registStudentToCourse() {

        Course courseA = new Course("Course A");
        Course courseB = new Course("Course B");

        Student student = new Student("John");

        Set<Course> courses = new HashSet<>();
        courses.add(courseA);
        courses.add(courseB);

        student.setLikedCourses(courses);

        this.studentService.save(student);
    }
    @GetMapping("/students")
    public List<Student> getALLStudents() {
        List<Student> listStudents = studentService.listAllStudents();

        return listStudents;
    }
    @GetMapping("/getStudent/{id}")
    public Student getStudent(@PathVariable Long id) {
        return this.studentService.findById(id);
    }
}
