package com.fastech.jpamapping.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name="Teacher_tbl")
public class Teacher {
    @Id
    private int teacherId;
    private String fullName;
    private String email;
    private String address;
    private String city;


}
