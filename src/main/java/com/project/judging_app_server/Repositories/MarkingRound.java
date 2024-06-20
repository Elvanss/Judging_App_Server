package com.project.judging_app_server.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MarkingRound extends JpaRepository<MarkingRound, Long> {
}
