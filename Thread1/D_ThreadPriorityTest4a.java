package com.rays.Thread1;

public class D_ThreadPriorityTest4a {
	public static void main(String[] args) {
		Thread t1 = new Thread(new C_ThreadRunnable3("Shivam"));
		Thread t2 = new Thread(new C_ThreadRunnable3("Mandloi"));

		t1.start();
		t1.setPriority(1);
		t2.start();
		t2.setPriority(10); // output Different aayega
	}

}
