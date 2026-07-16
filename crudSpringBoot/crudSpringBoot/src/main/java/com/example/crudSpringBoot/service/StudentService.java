package com.example.crudSpringBoot.service;

import com.example.crudSpringBoot.entity.Student;
import com.example.crudSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

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
        System.out.println("Inside Student Service");
     Student studentResp = studentRepository.saveStudent(studentReq);
        System.out.println("Exiting Student Service");
      return studentResp;
    }
}
