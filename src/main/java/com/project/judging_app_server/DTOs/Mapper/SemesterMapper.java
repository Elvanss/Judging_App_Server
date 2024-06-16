package com.project.judging_app_server.DTOs.Mapper;

import com.project.judging_app_server.DTOs.SemesterDTO;
import com.project.judging_app_server.Entities.Semester;
import org.springframework.stereotype.Component;

@Component
public class SemesterMapper {

    private final ProjectMapper projectMapper;

    public SemesterMapper(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    public SemesterDTO toSemesterDTO(Semester semester) {
        SemesterDTO semesterDTO = new SemesterDTO();
        semesterDTO.setId(semester.getId());
        semesterDTO.setSemesterName(semester.getSemesterName());
        semesterDTO.setYearSemester(semester.getYearSemester());
        semesterDTO.setProject(this.projectMapper.toProjectDTO(semester.getProject()));
        semesterDTO.setMarkAverage(semester.getMarkAverage());
        return semesterDTO;
    }

    public Semester toSemester(SemesterDTO semesterDTO) {
        Semester semester = new Semester();
        semester.setSemesterName(semesterDTO.getSemesterName());
        semester.setYearSemester(semesterDTO.getYearSemester());
        semester.setProject(ProjectMapper.toProject(semesterDTO.getProject()));
        semester.setMarkAverage(semesterDTO.getMarkAverage());
        return semester;
    }
}
