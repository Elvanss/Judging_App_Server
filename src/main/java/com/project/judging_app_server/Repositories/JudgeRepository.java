package com.project.judging_app_server.Repositories;

import com.project.judging_app_server.Entities.Judge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JudgeRepository extends JpaRepository<Judge, Long> {

}
