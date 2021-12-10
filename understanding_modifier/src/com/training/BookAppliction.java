package com.training;

public class BookAppliction {

	public static void main(String[] args) {
		
		Book headFirst = new Book();
		
	//	headFirst.setBookId(101);
	//	headFirst.setAuthorName("kathy Sieera");
	//	headFirst.setPrice(450.00);
		
		System.out.println(headFirst.getBookId());
		System.out.println(headFirst.getAuthorName());
		System.out.println(headFirst.getPrice());

		Book effJava = new Book("Effective Java",102,560.00);
		
		System.out.println(effJava.getBookId());
		System.out.println(effJava.getAuthorName());
		System.out.println(effJava.getPrice());
	}
	
}
