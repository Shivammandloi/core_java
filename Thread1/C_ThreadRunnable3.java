package com.rays.Thread1;

public class C_ThreadRunnable3 implements Runnable {

	private String name = null;

	public C_ThreadRunnable3(String name) {
		this.name = name;
	}

	public void run() {
		for (int i = 1; i <= 10; i++) {
			System.out.println(i + " " + name);
		}
	}

}
