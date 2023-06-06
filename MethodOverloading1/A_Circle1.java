package com.rays.MethodOverloading1;

public class A_Circle1 extends A_Shape1 {
	private int radius;

	public void sum() {
		System.out.println("Circle default method..");

	}

	public void sum(int radius) {
		System.out.println("radius method one parameter...");
	}

}
