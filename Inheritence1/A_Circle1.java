package com.rays.oop.Inheritence1;

public class A_Circle1 extends A_Shape1 {

	private int radius;
	private static final double PI = 3.14;

	public void setradius(int radius) {
		this.radius = radius;
	}

	public int getRadius() {
		return radius;
	}

	public void area() {
		double cArea = PI * radius * radius;
		System.out.println("cArea = " + cArea);
	}

//	public double area() {
//		double cArea = PI*radius*radius;
//		System.out.println("cArea = "+cArea);
//		return cArea;
//	}

}
