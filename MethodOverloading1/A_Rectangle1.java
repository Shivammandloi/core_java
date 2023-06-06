package com.rays.MethodOverloading1;

public class A_Rectangle1 extends A_Shape1 {

	private int length;
	private int width;

	public void area() {
		System.out.println("Rectangle default method... ");

	}

	public void area(int length, int width) {
		System.out.println("Rectangle Method Two parameter");
	}

}
