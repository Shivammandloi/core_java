package com.rays.Thread1;

public class B_ThreadWith2 extends Thread {

	private String name = null;

	public B_ThreadWith2(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " " + name);
		}
	}

}
