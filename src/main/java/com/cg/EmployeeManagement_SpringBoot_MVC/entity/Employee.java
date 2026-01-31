package com.cg.EmployeeManagement_SpringBoot_MVC.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Employee {
	
	@Id
	private int emp_id;
	private String name;
	private String department;
	private int mob_num;
	private String email;
	
	public Employee() {
		
	}
	
	public Employee(int emp_id, String name, String department, int mob_num, String email) {
		super();
		this.emp_id = emp_id;
		this.name = name;
		this.department = department;
		this.mob_num = mob_num;
		this.email = email;
	}
	
	
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public int getMob_num() {
		return mob_num;
	}
	public void setMob_num(int mob_num) {
		this.mob_num = mob_num;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "Employee [emp_id=" + emp_id + ", name=" + name + ", department=" + department + ", mob_num=" + mob_num
				+ ", email=" + email + "]";
	}

	

}
