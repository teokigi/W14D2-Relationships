package com.example.codeclan.Relationships.controllers;

import com.example.codeclan.Relationships.models.Department;
import com.example.codeclan.Relationships.models.Employee;
import com.example.codeclan.Relationships.models.Project;
import com.example.codeclan.Relationships.repositories.DepartmentRepository;
import com.example.codeclan.Relationships.repositories.EmployeeRepository;
import com.example.codeclan.Relationships.repositories.ProjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
public class RelationshipsController {

    @Autowired private DepartmentRepository departmentRepository;
    @Autowired private EmployeeRepository employeeRepository;
    @Autowired private ProjectRepository projectRepository;

    @GetMapping(value = "/employees")
    public List<Employee> getAllEmployees(){ return employeeRepository.findAll();}
    @GetMapping(value = "/employees/{id}")
    public Optional<Employee> getEmployee(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @GetMapping(value = "/departments")
    public List<Department> getAllDepartments(){ return departmentRepository.findAll();}
    @GetMapping(value = "/departments/{id}")
    public Optional<Department> getDepartment(@PathVariable Long id){
        return departmentRepository.findById(id);
    }

    @GetMapping(value = "/projects")
    public List<Project> getAllProjects(){ return projectRepository.findAll();}
    @GetMapping(value = "/projects/{id}")
    public Optional<Project> getProject(@PathVariable Long id){
        return projectRepository.findById(id);
    }

}
