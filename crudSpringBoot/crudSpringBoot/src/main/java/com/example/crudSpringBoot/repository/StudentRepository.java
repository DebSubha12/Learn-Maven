package com.example.crudSpringBoot.repository;

import com.example.crudSpringBoot.entity.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentRepository {
    public Student saveStudent(Student studentReq) {
        //save to DB
        System.out.println("Inside Student Repository");
        System.out.println("Exiting Student Repository");
        return null;
    }
}
