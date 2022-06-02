package com.maven.dao;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.Optional;

import org.junit.jupiter.api.Test;

import com.maven.dto.Employee;

class EmployeeDAOImplTest {
	
	EmployeeDAOImpl employeeDAOImpl = new EmployeeDAOImpl();
	Employee employee = new Employee(101, "TEST", 10000.0,"JAVA");
	
	@Test
	void testCreateEmployee() {
		//created Employee	
		Optional<Employee> adddeEmployee = employeeDAOImpl.addEmployee(employee);
		assertTrue(adddeEmployee.isPresent());
		assertNotNull(adddeEmployee.get());
		
		
	}
	
	@Test
	void testGetEmployeeEmployeeById() {
		employeeDAOImpl.addEmployee(employee);
		Optional<Employee> employee =employeeDAOImpl.getEmployeeById(101);
		assertTrue(employee.isPresent());
		assertNotNull(employee.get());
		
	}
	
	@Test
	void testUpdateEmployeeEmployees() {
		employeeDAOImpl.addEmployee(employee);
		Optional<Employee> emp =employeeDAOImpl.updateEmployee(employee);
		assertTrue(emp.isPresent());
		assertNotNull(emp.get());
		
	}
	
	
	
	
		@Test
		void testGetEmployeeEmployees() {
			employeeDAOImpl.getEmployees();	
			assertNotNull(employeeDAOImpl);
			
		
	}
}


