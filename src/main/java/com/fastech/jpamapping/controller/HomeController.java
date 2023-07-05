package com.fastech.jpamapping.controller;

import com.fastech.jpamapping.dto.Request;
import com.fastech.jpamapping.entity.Student;
import com.fastech.jpamapping.repository.StudentRepository;
import com.fastech.jpamapping.repository.TeacherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
    @Autowired
    TeacherRepository teacherRepository;
    @Autowired
    StudentRepository  studentRepository;


    @PostMapping("/save")
    public Student saveData(@RequestBody Request request){
        return studentRepository.save(request.getStudent());
    }

    @GetMapping("/findAll")
    public List<Student> findAllOrders(){
        return studentRepository.findAll();
    }





}
