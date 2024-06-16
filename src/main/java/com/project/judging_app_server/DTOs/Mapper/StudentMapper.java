package com.project.judging_app_server.DTOs.Mapper;

import com.project.judging_app_server.DTOs.StudentDTO;
import com.project.judging_app_server.Entities.Student;
import org.springframework.stereotype.Component;

@Component
public class StudentMapper {

    private final ProjectMapper projectMapper;

    public StudentMapper(ProjectMapper projectMapper) {
        this.projectMapper = projectMapper;
    }

    public StudentDTO toStudentDTO(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setFirstName(student.getFirstName());
        studentDTO.setLastName(student.getLastName());
        studentDTO.setEmail(student.getEmail());
        studentDTO.setPhone(student.getPhone());
        studentDTO.setDescription(student.getDescription());
        studentDTO.setCreateAt(student.getCreateAt());
        studentDTO.setModifyAt(student.getModifyAt());
        studentDTO.setModifyBy(student.getModifyBy());
        studentDTO.setCreateBy(student.getCreateBy());
        studentDTO.setDescp(student.getDescp());
        studentDTO.setProjectDTO(student.getProject() != null
                ? this.projectMapper.toProjectDTO(student.getProject())
                : null);
        return studentDTO;
    }

    public Student toStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setFirstName(studentDTO.getFirstName());
        student.setLastName(studentDTO.getLastName());
        student.setEmail(studentDTO.getEmail());
        student.setPhone(studentDTO.getPhone());
        student.setDescription(studentDTO.getDescription());
        student.setCreateAt(studentDTO.getCreateAt());
        student.setModifyAt(studentDTO.getModifyAt());
        student.setModifyBy(studentDTO.getModifyBy());
        student.setCreateBy(studentDTO.getCreateBy());
        student.setDescp(studentDTO.getDescp());
        return student;
    }


}
