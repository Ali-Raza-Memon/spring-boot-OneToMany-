package com.fastech.jpamapping.dto;

import com.fastech.jpamapping.entity.Student;
import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Request {
    private Student student;
}
