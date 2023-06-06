package com.rays.CollectionFramWork2;

public class A_EmployeeTest1a {
	public static void main(String[] args) {

		A_Employee1 e = new A_Employee1(1, "shivam", 24);
		A_Employee1 e2 = new A_Employee1(1, "shivam", 24);
		A_Employee1 e3 = new A_Employee1(3, "mandloi", 24);
		A_Employee1 e4 = new A_Employee1(4, "dada", 24);
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		System.out.println("equal = " + e.equals(e2));

	}

}
