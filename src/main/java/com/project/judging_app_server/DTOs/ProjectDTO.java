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
public class ProjectDTO {
    private Long id;
    private String title;
    private Date createAt;
    private Date modifyAt;
    private String modifyBy;
    private String createBy;
    private String description;
    private Integer numberOfSemester;
    private Integer numberOfStudent;
    private Integer numberOfJudge;
}
