package com.rays.ExceptionHandling1;

public class InsufficientBalanceTest6 {
	public static void main(String[] args)  {
		int balance = 1000;
		
		try {
			if (balance < 2000) {
				throw new InsufficientBalance6();
			}
			System.out.println(10/0);
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
	}

}
