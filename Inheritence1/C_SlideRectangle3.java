package com.rays.oop.Inheritence1;

public class C_SlideRectangle3 extends C_SlideShape3 {

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
		int rArea = length * width;
		System.out.println("rArea = " + rArea);
	}

}
