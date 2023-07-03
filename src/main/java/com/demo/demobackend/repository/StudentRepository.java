package com.demo.demobackend.repository;

import com.demo.demobackend.model.student;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<student,Integer> {
    
}