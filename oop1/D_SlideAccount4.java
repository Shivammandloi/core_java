package com.rays.oop1;

public class D_SlideAccount4 {

	private String name = null;
	private String accountType = null;
	private double balance = 0;
	private int deposite = 0;
	private int withdrawal = 0;
	private int fundTransfer = 0;
	private int payBill = 0;
	
	
	
	public void setName(String n) {
		name = n;
	}
	public String getName() {
		return name;
	}
	
	public void setAccountType(String a) {
		accountType = a;
	}
	
	public String getAccountType() {
		return accountType;
	}
	public void setBalance(double b) {
		balance = b;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void setDeposite(int d) {
		deposite = d;
	}
	public int getDeposite(){
		return deposite;
	}
	
	public void setWithdrawal(int w) {
		withdrawal = w;
	}
	public int getWithdrawal() {
		return withdrawal;
	}
	public void setFundTransfer(int f) {
		fundTransfer = f;
	}
	public int getFundTransfer() {
		return fundTransfer;
	}
	public void setPayBill(int pb) {
		payBill = pb;
	}
	public int getPayBill() {
		return payBill;
	}
	

}
