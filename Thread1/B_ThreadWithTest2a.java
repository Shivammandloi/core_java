package com.rays.Thread1;

public class B_ThreadWithTest2a {
	public static void main(String[] args) {

		B_ThreadWith2 t1 = new B_ThreadWith2("Ram");
		t1.setPriority(3);
		B_ThreadWith2 t2 = new B_ThreadWith2("Aadesh");
		t2.setPriority(10);

		t1.start();
		t2.start();

		Thread.currentThread().setPriority(1);
		for (int i = 1; i <= 5; i++) {
			System.out.println("main"); // output Different aayega
		}
	}

}
