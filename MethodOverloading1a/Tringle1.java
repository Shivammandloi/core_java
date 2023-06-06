package com.rays.MethodOverloading1a;

public class Tringle1 {

	private int base;
	private int higth;

	public int getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public int getHigth() {
		return higth;
	}

	public void setHigth(int higth) {
		this.higth = higth;
	}

	public void sub() {
		System.out.println("Tringle default method");

	}

	public void sub(int base, int higth) {
		System.out.println("Tringle Method Two parameter......");
	}

}
