package com.example.crudSpringBoot.service;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@Service
public class StudentService {

    //End point listner (/app/students POST)
    // 2.   Bussiness logic
    // 3.   Interact with DB to store
    // 4.    Response back to client (postman)

    private StudentRepository studentRepository;
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStudent(Student studentReq) {
        Student studentResp = studentRepository.save(studentReq);
     return studentResp;
    }

    //Read
    public Student getStudent(@PathVariable Long id) {
       Optional<Student> studentResp =  studentRepository.findById(id);
       if(studentResp.isPresent()) {
           return studentResp.get();
       }
       return null;
    }
}
