package com.cg.EmployeeManagement_SpringBoot_MVC.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cg.EmployeeManagement_SpringBoot_MVC.entity.Employee;
import com.cg.EmployeeManagement_SpringBoot_MVC.repo.EmployeeRepo;


@Service
public class EMployeeServiceImp implements EmployeeService{

	@Autowired
	EmployeeRepo repo;
	
	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> list=repo.findAll(); 
		return list;
	}

	@Override
	public Employee getEmployeeById(int id) {
		Employee emp =repo.findById(id).get();
		return emp;
	}

	@Override
	public void saveEmployee(Employee e) {
		repo.save(e);	
	}

	@Override
	public Employee updateEmployee(int id, Employee s) {
		Employee e1 =repo.findById(id).get();
		e1.setName(s.getName());
		e1.setEmail(s.getEmail());
		e1.setDepartment(s.getDepartment());
		e1.setMob_num(s.getMob_num());
		
		
		return repo.save(e1);
	}

	@Override
	public void deleteEmployee(int id) {
		
		Employee e2 =repo.findById(id).get();
		repo.delete(e2);
	}
	

}
