package com.example.codeclan.Relationships.repositories;

import com.example.codeclan.Relationships.models.Project;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProjectRepository extends JpaRepository<Project, Long> {
}
