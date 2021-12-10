package com.example.demo.model;

import static java.lang.Math.*;

public class Invoice {
	
	//Declaring a constant - note should be in all caps
	public static final int STARTNUMER =100; 
	private int invoiceNumber;  //instance variable
	
	private static double discount; //static or class variable
	
	public void show() {
		System.out.println(invoiceNumber);
		System.out.println(discount);
		//STARTNUMER++;  this wont compile because it is final 
		showAll();
	}

	/*
	 * Static method can access ONLY static variables and static method
	 */

	public static void showAll() {
		
		//System.out.println(invoiceNumber);
		System.out.println(discount);
		
		//show();
		
		System.out.println(Math.sqrt(4)); 
		//since static import is used we are not calling the methods with class Name
		
		double radian30 = Math.toRadians(30);
		
		double radian60 = Math.toRadians(60);
		
		System.out.println(Math.sin(radian30));
		System.out.println(Math.cos(radian60));
	}

}

