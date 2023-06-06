package com.rays.oop.constructor1;

public class Demo {
	private String name;
	private int address;

	public Demo() {
		System.out.println("default");
	}

	public Demo(String s) {
		this.name = s;
		System.out.println("one perameter");
	}

	public Demo(int a, String s) {
		this.name = s;
		this.address = a;
		System.out.println();
	}

	public String getName() {
		System.out.println(name);
		return name;
		
	}

	public int getAddress() {
		System.out.println(address);
		return address;
	}
}
