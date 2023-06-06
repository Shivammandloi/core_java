package com.rays.Thread1;

public class C_ThreadRunnableTest3a {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C_ThreadRunnable3("Ram"));
		Thread t2 = new Thread(new C_ThreadRunnable3("raja"));

		t1.start();
		t2.start();
	}

}
