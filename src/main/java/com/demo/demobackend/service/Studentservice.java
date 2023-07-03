package com.demo.demobackend.service;

import java.util.List;

import com.demo.demobackend.model.student;

public interface Studentservice {
    
    public student saveStudent(student Student);

    public List<student> getAllStudent();

}
