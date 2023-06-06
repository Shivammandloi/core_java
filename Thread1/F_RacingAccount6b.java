package com.rays.Thread1;

public class F_RacingAccount6b extends Thread {
	public static F_RacingAccount6a data = new F_RacingAccount6a();

	String name = null;

	public F_RacingAccount6b(String name) { // constructor
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <= 5; i++) {
			data.deposite(name, 1000);
		}
	}

}
