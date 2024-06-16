package com.project.judging_app_server.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class JudgeDTO {
    private Long id;
    private String account;
    private String pwd;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date createAt;
    private Date modifyAt;
    private Integer numberOfProject;
}
