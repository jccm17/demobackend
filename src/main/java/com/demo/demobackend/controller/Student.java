package com.demo.demobackend.controller;

import java.io.Serializable;
import java.util.List;

import com.demo.demobackend.model.student;
import com.demo.demobackend.service.Studentservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = {"*"})
public class Student implements Serializable{

    @Autowired
    private Studentservice studentService;

    @PostMapping("/add")
    public student add(@RequestBody student Student) {
        return studentService.saveStudent(Student);
        //return "New student is added";
    }

    @GetMapping("/getAll")
    public List<student> getAllStudent() {
        return studentService.getAllStudent();
    }

}
