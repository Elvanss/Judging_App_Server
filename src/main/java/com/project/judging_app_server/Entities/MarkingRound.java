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
@Table(name = "marking_round")
public class MarkingRound implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "round")
    private Integer round;

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

    @ManyToOne
    @JoinColumn(name = "criteria_ID", referencedColumnName = "id")
    private Criteria criteria;

    @ManyToOne
    @JoinColumn(name = "judge_id", referencedColumnName = "id")
    private Judge judge;
}
