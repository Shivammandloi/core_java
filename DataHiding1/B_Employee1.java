package com.rays.oop.DataHiding1;

public class B_Employee1 extends B_Person1 {

	private int salary = 0;
	// private String name = null;
	
	public B_Employee1() {

	}

	public B_Employee1(String name, String address, int salary) {
		//super();
		super(name, address);
		this.salary = salary;
		System.out.println("3 param constractor...");
		

	}

	

	public int getSalary() {
		System.out.println(salary);
		return salary;
	}

	
	
	
	
}
