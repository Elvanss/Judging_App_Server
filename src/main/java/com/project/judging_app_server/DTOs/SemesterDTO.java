package com.project.judging_app_server.DTOs;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class SemesterDTO {
    private Long id;
    private String semesterName;
    private Integer yearSemester;
    private ProjectDTO project;
    private Double markAverage;
}
