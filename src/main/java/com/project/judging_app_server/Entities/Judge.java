package com.project.judging_app_server.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.ArrayList;
import java.sql.Date;
import java.util.List;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "judge")
public class Judge implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "account", length = 20)
    private String account;

    @Column(name = "pwd", length = 20)
    private String pwd;

    @Column(name = "first_name", length = 20)
    private String firstName;

    @Column(name = "last_name", length = 20)
    private String lastName;

    @Column(name = "email", length = 20)
    private String email;

    @Column(name = "phone", length = 20)
    private String phone;

    @Column(name = "description", length = 512)
    private String description;

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

    @ManyToMany
    @JoinTable(
            name = "judge_project",
            joinColumns = @JoinColumn(name = "judge_ID"),
            inverseJoinColumns = @JoinColumn(name = "project_ID")
    )
    private List<Project> projects = new ArrayList<>();

    public Integer getNumberOfProject() {
        return projects.size();
    }

    public void addProject(Project project) {
        projects.add(project);
    }

    public void removeProject(Project project) {
        projects.remove(project);
    }
}