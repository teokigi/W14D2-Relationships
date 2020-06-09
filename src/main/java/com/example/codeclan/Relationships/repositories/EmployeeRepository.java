package com.example.codeclan.Relationships.repositories;

import com.example.codeclan.Relationships.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
