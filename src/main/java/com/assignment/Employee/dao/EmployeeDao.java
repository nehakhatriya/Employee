package com.assignment.Employee.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.assignment.Employee.entity.Employee;

public interface EmployeeDao extends JpaRepository<Employee,Integer>{

}
