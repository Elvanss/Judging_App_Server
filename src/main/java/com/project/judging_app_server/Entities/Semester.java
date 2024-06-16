package com.project.judging_app_server.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "semester")
public class Semester implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "semester_name", length = 20)
    private String semesterName;

    @Column(name = "year_semester")
    private Integer yearSemester;

    @ManyToOne
    @JoinColumn(name = "project_ID", nullable = false)
    private Project project;

    @Column(name = "mark_average")
    private Double markAverage;
}

