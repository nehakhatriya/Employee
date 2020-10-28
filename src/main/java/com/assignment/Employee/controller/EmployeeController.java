package com.assignment.Employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.assignment.Employee.dao.EmployeeDao;
import com.assignment.Employee.entity.Employee;

@RestController
public class EmployeeController {

	@Autowired
	EmployeeDao dao;
	
	@GetMapping("/employees")
	public List<Employee> listEmployee(){
		return dao.findAll();
	}
	
	@GetMapping("/employees/{id}")
	public Employee getEmployee(@PathVariable int id) {
		return dao.findById(id).get();
	}
	
	@DeleteMapping("/employees/{id}")
	public void deleteEmployee(@PathVariable int id)
	{
		dao.deleteById(id);
	}
	
	@PostMapping("/employees")
	public void addEmployee(@RequestBody() Employee employee)
	{
		dao.save(employee);
	}
	
	@PutMapping("/employees/{id}")
	public void editEmployee(@RequestBody() Employee employee) {
		dao.save(employee);
	}
	
}
