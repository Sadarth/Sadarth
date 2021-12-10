package com.example.demo.services;

import com.example.demo.model.*;

public class EmployeeService {
	
	//DRY Principle followed
	public double calculateBonus(Employee employee) {
	
	return calculateBonus(employee.getSalary());
	
}

  //Overloaded method(same name  n diff arug)
	
	public double calculateBonus(double salary) {
 
		return salary * .30;
	}
	
	//overload method with autoboxing
	
	public double calculateBonus(Double salary) {
		
		return (salary * .30) + 1000;
	}
	
	public Employee updateSalary(Employee employee) {
		
		double updateSalary = employee.getSalary()+20000;
		
		employee.setSalary(updateSalary);
		
		return employee;
		
	}
}
