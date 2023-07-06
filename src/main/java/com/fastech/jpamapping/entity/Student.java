package com.fastech.jpamapping.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Setter
@Getter
@Entity
@Table
public class Student {
    @Id
    @GeneratedValue
    private int stdId;
    private String fullName;
    private String email;
    private String address;
    private String city;


    @OneToMany(targetEntity = Teacher.class,cascade = CascadeType.ALL)
    @JoinColumn(name="student_id", referencedColumnName = "stdId")
    private List<Teacher> teachers;
}
