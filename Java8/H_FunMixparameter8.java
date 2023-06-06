package com.rays.Java8;

public interface H_FunMixparameter8 {

	public void show();  // Functional interface

	public default void sum(int c, int d) {
		System.out.println(" default.....");
	}

	public static void mult(String e, String f) {
		System.out.println(" static....");
	}

}
