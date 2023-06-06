package com.rays.MethodOverloading1a;

public class Circle1 {
	private int radius;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public void sum() {
		System.out.println("Circle default method..");

	}

	public void sum(int radius) {
		System.out.println("radius method one parameter...");
	}
}
