package com.rays.Thread1;

public class F_RacingAccountTest6c {
	public static void main(String[] args) {
		F_RacingAccount6b t1 = new F_RacingAccount6b("Ram");
		F_RacingAccount6b t2 = new F_RacingAccount6b("Rawan");
		// RacingAccount6b t3 = new RacingAccount6b("jaan..");

		t1.start();
		t2.start();
		// t3.start();
	}

}
