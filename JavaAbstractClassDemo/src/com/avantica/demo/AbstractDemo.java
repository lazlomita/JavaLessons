package com.avantica.demo;

/* File name : AbstractDemo.java */
public class AbstractDemo {
	
	public static void main(String [] args) {
		/* Following is not allowed and would raise error */
		//Employee e = new Employee("George W.", "Houston, TX", 43);
		
		Employee e = new Salary("George W.", "Houston, TX", 43, 1200);
		
		System.out.println("\n Call mailCheck using Employee reference--");
		e.mailCheck();
	}
}