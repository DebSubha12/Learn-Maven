package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.service.StudentService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/students")
public class StudentController {

    //dependency injection
    private StudentService studentService;
    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }
    //create student
    @PostMapping("/create")
    public String createStudent(@RequestBody Student student) {
        System.out.println("Inside Student Controller");
       Student createdStudent = studentService.createStudent(student);
        System.out.println("Exiting Student Controller");
       return "Student Created Successfully" ;
    }
    //read student

    //update student

    //delete student
}
