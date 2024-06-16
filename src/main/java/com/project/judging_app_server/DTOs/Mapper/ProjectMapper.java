package com.project.judging_app_server.DTOs.Mapper;

import com.project.judging_app_server.DTOs.ProjectDTO;
import com.project.judging_app_server.Entities.Project;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

@Component
public class ProjectMapper {

    public ProjectDTO toProjectDTO(Project project) {
        ProjectDTO projectDTO = new ProjectDTO();
        projectDTO.setId(project.getId());
        projectDTO.setTitle(project.getTitle());
        projectDTO.setModifyBy(project.getModifyBy());
        projectDTO.setCreateBy(project.getCreateBy());
        projectDTO.setDescription(project.getDescription());
        projectDTO.setNumberOfSemester(project.getTotalNumberOfSemesters());
        projectDTO.setNumberOfStudent(project.getTotalNumberOfStudents());
        projectDTO.setNumberOfJudge(project.getTotalNumberOfJudges());
        return projectDTO;
    }

    public static Project toProject(ProjectDTO projectDTO) {
        Project project = new Project();
        project.setTitle(projectDTO.getTitle());
        project.setModifyBy(projectDTO.getModifyBy());
        project.setCreateBy(projectDTO.getCreateBy());
        project.setDescription(projectDTO.getDescription());
        return project;
    }

}
