package com.example.codeclan.Relationships.repositories;

import com.example.codeclan.Relationships.models.Department;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
