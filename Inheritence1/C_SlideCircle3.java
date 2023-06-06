package com.rays.oop.Inheritence1;

public class C_SlideCircle3 extends C_SlideShape3 {
	private int radius = 0;
	private static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void area() {
		double cArea = PI * radius * radius;
		System.out.println("cArea = " + cArea);
	}

}
