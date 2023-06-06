package com.rays.oop.DataHiding1;

public class A_A2 {

	public A_A2() {
		System.out.println("khali wala A_A2...");
	}

	public A_A2(int a) {
		this();
		System.out.println("one parameter A_A2");
	}

	public A_A2(String sF, int b) {
		this(10);
		System.out.println("1 param wala A_A2..");
	}

}
