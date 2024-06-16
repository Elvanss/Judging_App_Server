package com.project.judging_app_server.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.sql.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "criteria")
public class Criteria implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "criteria_name", length = 100)
    private String criteriaName;

    @Column(name = "mark")
    private Integer mark;

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

    @Column(name = "description", length = 20)
    private String description;

}
