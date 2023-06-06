package com.rays.oop.Inheritence1;

public class C_SlideShapeTest3 {
	public static void main(String[] args) {
		C_SlideShape3 cs = new C_SlideCircle3();
		C_SlideCircle3 c = (C_SlideCircle3) cs;
		c.getColor();
		c.getBorderWidth();
		c.area();
	}

}
