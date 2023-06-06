package com.rays.oop.Inheritence1;

public class B_ShapeConstructorTest2 {
	public static void main(String[] args) {

		// BShapeConstructor2 sc = new BShapeConstructor2();

		B_ShapeConstructor2[] s = new B_ShapeConstructor2[2];
		s[0] = new B_RectangleConstructor2();

		B_RectangleConstructor2 s1 = (B_RectangleConstructor2) s[0];
		// s1.BShapeConstructor2("color",20);

	}

}
