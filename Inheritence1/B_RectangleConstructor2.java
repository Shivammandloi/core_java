package com.rays.oop.Inheritence1;

public class B_RectangleConstructor2 extends B_ShapeConstructor2 {

	private int length = 0;
	private int width = 0;

	public B_RectangleConstructor2() {

	}

	public B_RectangleConstructor2(int l) {
		System.out.println("Rectangle one parameter");
	}

	public B_RectangleConstructor2(int i, int w) {
		System.out.println("Rectanglr two parameter");
	}

}
