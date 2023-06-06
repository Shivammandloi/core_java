package com.rays.Thread1;

public class F_RacingAccount6a {

	private int balance = 0;

	public void setBalance(int balance) {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		this.balance = balance;
	}

	public int getBalance() {
		try {
			Thread.sleep(200);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return balance;
	}

	public synchronized void deposite(String name, int amt) {
		int bal = getBalance();
		bal = bal + amt;
		setBalance(bal);
		System.out.println(name + " " + bal);
	}
}
