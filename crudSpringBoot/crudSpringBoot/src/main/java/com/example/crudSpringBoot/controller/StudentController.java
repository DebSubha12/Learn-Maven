package com.example.crudSpringBoot.controller;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.service.StudentService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

       Student createdStudent = studentService.createStudent(student);

       return "Student Created Successfully" ;
    }

    //read student
    @GetMapping("/get/{id}")
    public ResponseEntity<Student> getStudents(@PathVariable Long id) {
       Student studentResp = studentService.getStudent(id);
       if(studentResp == null) {
           return ResponseEntity.notFound().build();
       }
       return ResponseEntity.ok(studentResp);
    }
    //update student

    //delete student
}
