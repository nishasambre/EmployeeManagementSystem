package com.tka.emp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


import com.tka.emp.dao.EmployeeDao;
import com.tka.emp.entity.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDao ed;
	
	@GetMapping("AllData")
	public List<Employee> getAllEmployee() {
	
		return ed.getAllEmployee();
	}
	@PostMapping("/save")
	public String saveEmployeeDetails(@RequestBody Employee emp) {
		return ed.saveEmployeeDetails(emp);
	}
	
	@PutMapping("/update")
	public String updateStudentDetails(@RequestBody Employee student) {
		return ed.updateEmployeeDetails(student);
	}
	
	@DeleteMapping("/delete")
	public String deleteEmplo(@RequestBody Employee emp) {
		return ed.deleteEmployee(emp);
	}
	
	

}
