package com.demo.demobackend.service;

import java.util.List;

import com.demo.demobackend.model.student;
import com.demo.demobackend.repository.StudentRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class StudentServiceImpl implements Studentservice {

    @Autowired
    private StudentRepository studentRepo;
    
    @Override
    public student saveStudent(student Student) {
        return studentRepo.save(Student);
    }

    @Override
    public List<student> getAllStudent() {
        return studentRepo.findAll();
    }
    
}
