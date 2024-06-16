package com.project.judging_app_server.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class StudentDTO {
    private Long id;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String description;
    private Date createAt;
    private Date modifyAt;
    private String modifyBy;
    private String createBy;
    private String descp;
    private ProjectDTO ProjectDTO;
}
