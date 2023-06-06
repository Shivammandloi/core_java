package com.rays.oop.Inheritence1;

public class B_ShapeConstructor2 {

	private String color = null;
	private int borderWidth = 0;

	public B_ShapeConstructor2() {

	}

	public B_ShapeConstructor2(String s, int i) {
		System.out.println("Shape Constructor Two parameter");
	}

	public double area() {
		System.out.println("Shape Area Method......");
		return 0;
	}
}
