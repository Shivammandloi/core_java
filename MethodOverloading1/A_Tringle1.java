package com.rays.MethodOverloading1;

public class A_Tringle1 extends A_Shape1 {
	private int base;
	private int higth;

	public void sub() {
		System.out.println("Tringle default method");

	}

	public void sub(int base, int higth) {
		System.out.println("Tringle Method Two parameter......");
	}

}
