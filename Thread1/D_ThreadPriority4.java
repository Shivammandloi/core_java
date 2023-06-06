package com.rays.Thread1;

public class D_ThreadPriority4 {

	private String name = null;

	public D_ThreadPriority4(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name);
		}
	}
}
