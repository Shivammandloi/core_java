package com.rays.Thread1;

public class E_DaemonThreadTest5a {

	public static void main(String[] args) {

		E_DaemonThread5 t1 = new E_DaemonThread5();
		E_DaemonThread5 t2 = new E_DaemonThread5();

		t1.setDaemon(true);
		t2.setDaemon(true);
		t1.start();
		t2.start();

		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
		}

		System.out.println("Leaving main method....");
		System.out.println("Now JVM will exit..");
	}

}
