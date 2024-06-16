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
@Table(name = "student")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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

    @Column(name = "descp", length = 20)
    private String descp;

    @ManyToOne
    @JoinColumn(name = "project_ID", referencedColumnName = "id")
    private Project project;
}
