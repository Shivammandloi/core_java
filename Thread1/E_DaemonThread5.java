package com.rays.Thread1;

public class E_DaemonThread5 extends Thread {
	@Override
	public void run() {
		System.out.println("daemon Started = " + Thread.currentThread());
		while (true) {
			try {
				Thread.sleep(200);
				System.out.println("Daemon T : woke up again");
			} catch (InterruptedException e) {
			}
		}
	}

}
