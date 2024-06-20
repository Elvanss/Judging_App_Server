package com.project.judging_app_server.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.antlr.v4.runtime.misc.NotNull;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "project")
public class Project implements Serializable {

    private static final Logger log = LoggerFactory.getLogger(Project.class);

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Column(name = "title")
    private String title;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "create_at")
    private Date createAt;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "modify_at")
    private Date modifyAt;

    @Column(name = "modify_by")
    private String modifyBy;

    @Column(name = "create_by")
    private String createBy;

    @Column(name = "description")
    private String description;

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Semester> semesters = new ArrayList<>();

    @OneToMany(mappedBy = "project", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Student> students = new ArrayList<>();

    @ManyToMany(mappedBy = "projects")
    private Set<Judge> judges = new HashSet<>();

    public Integer getTotalNumberOfSemesters() {
        return semesters.size();
    }

    public void addSemester(Semester semester) {
        if (semester == null) {
            log.error("Attempt to add a null semester to the project");
            return;
        }
        this.semesters.add(semester);
        semester.setProject(this);
    }

    public void removeSemester(Semester semester) {
        if (semester == null || !this.semesters.contains(semester)) {
            log.error("Attempt to remove a non-existent semester");
            return;
        }
        this.semesters.remove(semester);
        semester.setProject(null);
    }

    public Integer getTotalNumberOfStudents() {
        return students.size();
    }

    public void addStudent(Student student) {
        if (student == null) {
            log.error("Attempt to add a null student to the project");
            return;
        }
        this.students.add(student);
        student.setProject(this);
    }

    public void removeStudent(Student student) {
        if (student == null || !this.students.contains(student)) {
            log.error("Attempt to remove a non-existent student");
            return;
        }
        this.students.remove(student);
        student.setProject(null);
    }

    public Integer getTotalNumberOfJudges() {
        return judges.size();
    }
}

