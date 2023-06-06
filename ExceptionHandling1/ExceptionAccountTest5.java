package com.rays.ExceptionHandling1;

public class ExceptionAccountTest5 {
	public static void main(String[] args) {
		ExceptionAccount5 a = new ExceptionAccount5();
		a.setBalance(1000);
		System.out.println(a.getBalance());
		a.deposite(500);
		a.withdrawal(1);
		a.deposite(1001);
		a.withdrawal(1);
		
		
	}

}
