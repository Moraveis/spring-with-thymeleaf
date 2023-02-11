package me.joao.springwiththymeleaf.entity;

import lombok.Builder;
import lombok.Data;
import lombok.ToString;

@Data
@Builder
@ToString
public class Employee {

    private Integer id;
    private String firstName;
    private String lastName;
    private String email;
}
