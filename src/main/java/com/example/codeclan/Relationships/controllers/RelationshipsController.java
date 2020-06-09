package com.example.codeclan.Relationships.controllers;

import com.example.codeclan.Relationships.models.Department;
import com.example.codeclan.Relationships.models.Employee;
import com.example.codeclan.Relationships.models.Project;
import com.example.codeclan.Relationships.repositories.DepartmentRepository;
import com.example.codeclan.Relationships.repositories.EmployeeRepository;
import com.example.codeclan.Relationships.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RelationshipsController {

    @Autowired private DepartmentRepository departmentRepository;
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private ProjectRepository projectRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){ return employeeRepository.findAll();}
    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){ return departmentRepository.findAll();}
    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){ return projectRepository.findAll();}
}
