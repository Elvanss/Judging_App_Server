package com.project.judging_app_server.Repositories;

import com.project.judging_app_server.Entities.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {

}
