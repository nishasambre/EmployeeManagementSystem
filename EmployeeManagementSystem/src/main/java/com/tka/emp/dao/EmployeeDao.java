package com.tka.emp.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import com.tka.emp.entity.Employee;

@Repository
public class EmployeeDao {

	@Autowired
	private SessionFactory sf;
	
	public List<Employee> getAllEmployee() {
	
		Session session = sf.openSession();
		Criteria criteria =session.createCriteria(Employee.class);
		List<Employee> list = criteria.list();
		session.close();
		return list;
	}
	public String saveEmployeeDetails(Employee emp) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.save(emp);
		tr.commit();
		
		return "Data Saved Sucessfully...";
	}
	
	public String updateEmployeeDetails(Employee emp) {
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.update(emp);
		tr.commit();
		
		return "Data Updated Sucessfully....";
	}
    public String deleteEmployee(Employee emp) {
		
		Session session = sf.openSession();
		Transaction tr =  session.beginTransaction();
		session.delete(emp);
		tr.commit();
		
		return "Data Deleted Sucessfully....";
	}    
	

}
