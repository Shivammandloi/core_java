package com.rays.Thread1;

public class A_Thread1 {

	String name = null;

	public A_Thread1(String name) { // constructor
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name);
		}
	}
}
