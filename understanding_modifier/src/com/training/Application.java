package com.training;

public class Application {

	public static void main(String[] args) {
		
		Student ram = new Student();
		//can't access firstName btw its marked as private
		//System.out.println(ram.firstName);
		
		//can access feePaid because it is marked as default (its package scope)
		System.out.println(ram.fees);
		
	}

}
;