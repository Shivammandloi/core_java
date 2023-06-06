package com.rays.MethodOverloading1a;

public class Rectangle1 {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public void area() {
		System.out.println("Rectangle default method... ");

	}

	public void area(int length, int width) {
		System.out.println("Rectangle Method Two parameter");
	}

}
