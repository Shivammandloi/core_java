package com.rays.oop.Inheritence1;

public class A_Shape1 {

	private String color = null;
	private int borderWidth = 0;

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getBorderWidth() {
		return borderWidth;
	}

	public void setBorderWidth(int borderWidth) {
		this.borderWidth = borderWidth;
	}

	public void area() {
		System.out.println("Shape area Method ");
	}

//	public double area() {
//		System.out.println("Shape area Method ");
//		return 0;
//	}

}
