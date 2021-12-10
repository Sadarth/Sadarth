package com.example.demo;

import java.util.Scanner;

import com.example.demo.model.Employee;
import com.example.demo.model.Invoice;
import com.example.demo.services.EmployeeService;

public class Application {

	public static void main(String[] args) {
		
		int employeeId = Integer.parseInt(args[0]);
		String employeeName = args[1];
		String designation = args[2];
		double salary = Double.parseDouble(args[3]);
		
		Employee ram = new Employee(101, "Arun" , "developer", 50000);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Employee Id");
		 
		    int empId = sc.nextInt();
		
		System.out.println("Enter the Employee Name");
		
		    String empName = sc.next();
		
		System.out.println("Enter the Employee Designation");
		
		    String desig = sc.next();
		
		System.out.println("Enter the Employee Salary");
		
		    double empsal = sc.nextDouble();
		
		  Employee shyam = new Employee(empId,empName,desig,empsal);
		
		sc.close();
		//Calling the Overload Method
		
		EmployeeService service = new EmployeeService();
		
		System.out.println("Expected: 15000 =>Actual:=" +service.calculateBonus(ram));
		
		System.out.println("Expected: 18000 =>Actual:=" +service.calculateBonus(shyam.getSalary()));

	    Double salary2 = Double.valueOf(50000);
	    
	    int intSalary2 = (int)(salary2.doubleValue());
	    
	    double salary3 = salary2.doubleValue();
	    
	    int salary4 = (int)salary3;
	    
	    System.out.println("Expected: 16000 =>Actual:=" +service.calculateBonus(salary2));
	    
	    Employee rakesh = new Employee(102, "Rakesh" , "developer", 70000);
	    
	    service.updateSalary(rakesh);
	    
	    System.out.println("Expected: 90000 =>Actual:=" +rakesh.getSalary());
	
	    Invoice.showAll();
	}
	
}
