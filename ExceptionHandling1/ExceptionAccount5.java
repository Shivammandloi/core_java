package com.rays.ExceptionHandling1;

public class ExceptionAccount5 {
	
	private int balance = 0;
	
	

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	public void deposite(int Amount) {
		int total = getBalance()+Amount;
		setBalance(total);
		System.out.println("Balance After Deposite ="+getBalance());
	}
	
	public void withdrawal(int Amount) {
		int total = getBalance()-Amount;
		if(total>=2000) {
			setBalance(total);
			System.out.println("Balance After Withdrawal ="+getBalance());
		}else {
			System.out.println("Insufficient Balance ...");
		}
	}

}
