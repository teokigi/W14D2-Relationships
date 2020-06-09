package com.example.codeclan.Relationships;

import com.example.codeclan.Relationships.models.Department;
import com.example.codeclan.Relationships.models.Employee;
import com.example.codeclan.Relationships.models.Project;
import com.example.codeclan.Relationships.repositories.DepartmentRepository;
import com.example.codeclan.Relationships.repositories.EmployeeRepository;
import com.example.codeclan.Relationships.repositories.ProjectRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RelationshipsApplicationTests {


	@Autowired private EmployeeRepository employeeRepository;
	@Autowired private DepartmentRepository departmentRepository;
	@Autowired private ProjectRepository projectRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void canCreateAndSaveAEmployeeProjectDepartment(){
		Department department = new Department("justAName");
		departmentRepository.save(department);

		Project project = new Project("ehhh",69);
		projectRepository.save(project);

		Employee employee = new Employee("Jim","Jarvis",666,department);
		employeeRepository.save(employee);
		employee.addProject(project);
		project.addEmployee(employee);

	}

}
