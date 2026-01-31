package com.cg.EmployeeManagement_SpringBoot_MVC.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.EmployeeManagement_SpringBoot_MVC.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer>{

}
