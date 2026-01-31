package com.cg.EmployeeManagement_SpringBoot_MVC.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.EmployeeManagement_SpringBoot_MVC.entity.Employee;
import com.cg.EmployeeManagement_SpringBoot_MVC.service.EmployeeService;

@Controller
@RequestMapping("/Employees")
public class EmployeeController {

	@Autowired
	EmployeeService service;
	
	@GetMapping() //base handler method
	public String listEmployees(Model model)
	{
		model.addAttribute("list",service.getAllEmployee());
		return "Employees";
	}
	
	
	@GetMapping("/add")
	public String addEmployeeForm(Model model)
	{
		model.addAttribute("employee",new Employee());
		return "Employee-form";
	}
	
	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute ("employee") Employee emp)
	{
		service.saveEmployee(emp);
		return "redirect:/Employees";
	}
	
	
	@GetMapping("/edit/{id}")
	public String getEditEmployeeForm(@PathVariable int id,Model model)
	{
		model.addAttribute("employee",service.getEmployeeById(id));
		return "Employee-form";
	}
	
	
	@PostMapping("/update/{id}")
	public String updateEmployee(@PathVariable int id,@ModelAttribute Employee emp)
	{
		service.updateEmployee(id, emp);
		return "redirect:/Employees";
	}
	
	
	@GetMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		service.deleteEmployee(id);
		return "redirect:/Employees";
	}
	
	//post is used only for save and update with id we are sending data so post 
    //	get for fetching the data
//	again for commit 
	
}
