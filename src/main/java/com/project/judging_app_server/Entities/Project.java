package com.project.judging_app_server.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "project")
public class Project implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title", length = 20)
    private String title;

    @Temporal(TemporalType.DATE)
    @Column(name = "create_at")
    private Date createAt;

    @Temporal(TemporalType.DATE)
    @Column(name = "modify_at")
    private Date modifyAt;

    @Column(name = "modify_by", length = 20)
    private String modifyBy;

    @Column(name = "create_by", length = 20)
    private String createBy;

    @Column(name = "description", length = 512)
    private String description;

    @OneToMany(mappedBy = "project")
    private List<Semester> semesters = new ArrayList<>();

    @OneToMany(mappedBy = "project")
    private List<Student> students = new ArrayList<>();

    @ManyToMany(mappedBy = "projects")
    private List<Judge> judges = new ArrayList<>();

    /* Methods for arraylist: semesters, students, judges
    * GetTotalNumber
    * Add
    * Remove
     */

    public Integer getTotalNumberOfSemesters() {
        return semesters.size();
    }

    public void addSemester(Semester semester) {
        this.semesters.add(semester);
        semester.setProject(this);
    }

    public void removeSemester(Semester semester) {
        this.semesters.remove(semester);
        semester.setProject(null);
    }

    public Integer getTotalNumberOfStudents() {
        return students.size();
    }

    public void addStudent(Student student) {
        this.students.add(student);
        student.setProject(this);
    }

    public void removeStudent(Student student) {
        this.students.remove(student);
        student.setProject(null);
    }

    public Integer getTotalNumberOfJudges() {
        return judges.size();
    }

    public void addJudge(Judge judge) {
        this.judges.add(judge);
        judge.getProjects().add(this);
    }

    public void removeJudge(Judge judge) {
        this.judges.remove(judge);
        judge.getProjects().remove(this);
    }

}
