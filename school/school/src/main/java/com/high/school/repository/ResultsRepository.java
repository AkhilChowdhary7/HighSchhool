package com.high.school.repository;

import com.high.school.entity.Results;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResultsRepository extends JpaRepository<Results, Long> {
}
