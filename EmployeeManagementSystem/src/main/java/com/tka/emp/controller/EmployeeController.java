package com.tka.emp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.tka.emp.entity.Employee;
import com.tka.emp.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService es;
	
	
	@GetMapping("all")
	public List<Employee> getAllEmployee() {
		return es.getAllEmployee();
	}
	
	@PostMapping("/save")
	public String saveEmployeeDetails(@RequestBody Employee emp) {
		return es.saveEmployeeDetails(emp);
	}
	
	@PutMapping("/update")
	 public String updateEmployeeDetails(@RequestBody Employee emp) {
		return es.saveEmployeeDetails(emp);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmployee(@RequestBody Employee emp) {
		return es.deleteEmplo(emp);
	}
	
}
