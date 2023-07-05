package com.fastech.jpamapping.service;

import com.fastech.jpamapping.entity.Student;
import com.fastech.jpamapping.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;
    public List<Student> findAll() {
        return studentRepository.findAll();
    }



}
