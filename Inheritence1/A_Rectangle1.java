package com.rays.oop.Inheritence1;

public class A_Rectangle1 extends A_Shape1 {

	private int length = 0;
	private int width = 0;

	public void setLength(int a) {
		length = a;
	}

	public int getLength() {
		return length;
	}

	public void setWidth(int l) {
		width = l;
	}

	public int getWidth() {
		return width;
	}

	public void area() {
		int rArea = length * width;
		System.out.println("rArea =" + rArea);
	}

//	public double area() {
//		double  rArea = length * width;
//		System.out.println("rArea =" + rArea);
//		return rArea;
//	}

}
