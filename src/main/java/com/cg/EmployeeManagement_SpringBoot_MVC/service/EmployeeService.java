package com.cg.EmployeeManagement_SpringBoot_MVC.service;

import java.util.List;

import com.cg.EmployeeManagement_SpringBoot_MVC.entity.Employee;

public interface EmployeeService {
	
	public List<Employee> getAllEmployee() ;
	
	public Employee getEmployeeById(int id);
	
	public void saveEmployee(Employee e);
	
	public Employee updateEmployee(int id,Employee s);
	
	public void deleteEmployee(int id);
	
}
