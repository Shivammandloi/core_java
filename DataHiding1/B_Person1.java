package com.rays.oop.DataHiding1;

public class B_Person1 {

	private String name;
	private String address;

	public B_Person1() {
		System.out.println("default constractor person...");

	}

	public B_Person1(String name, String address) {
		this.name = name;
		this.address = address;
		System.out.println("2 param constractor ... ");

	}

	public String getName() {
		System.out.println(name);
		return name;
	}

	public String getAddress() {
		System.out.println(address);
		return address;
	}

}
