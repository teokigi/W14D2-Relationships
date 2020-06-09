package com.example.codeclan.Relationships.controllers;

import com.example.codeclan.Relationships.repositories.DepartmentRepository;
import com.example.codeclan.Relationships.repositories.EmployeeRepository;
import com.example.codeclan.Relationships.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RelationshipsController {

    @Autowired private DepartmentRepository departmentRepository;
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private ProjectRepository projectRepository;

    @GetMapping(value = "/relationships")
    public List<Employee> getAllEmployees(){ return employeeRepository.findAll();}
}
