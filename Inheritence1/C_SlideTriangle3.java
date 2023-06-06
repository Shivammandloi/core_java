package com.rays.oop.Inheritence1;

public class C_SlideTriangle3 extends C_SlideShape3 {
	int base;
	int higth;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public void area() {
		int tArea = 1 / 2 * base * higth;
		System.out.println("tArea = " + tArea);
	}

}
