package com.rays.Java8;

public interface G_FunMix7 {
	
	public void show();
	
	public default void sum() {
		System.out.println(" default.....");
	}
	public static void mult() {
		System.out.println(" static....");
	}

}
