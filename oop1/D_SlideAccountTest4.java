package com.rays.oop1;

public class D_SlideAccountTest4 {
	public static void main(String[] args) {
		D_SlideAccount4 s = new D_SlideAccount4();
		
		s.setName("Shivam");
		s.setAccountType("Saving");
		s.setBalance(10.10);
		s.setDeposite(100);
		s.setWithdrawal(50);
		s.setFundTransfer(100);
		s.setPayBill(200);
		
		System.out.println(" Name = " + s.getName());
		System.out.println(" Accounttype = " + s.getAccountType());
		System.out.println(" Balance = " + s.getBalance());
		System.out.println(" Deposite = " + s.getDeposite());
		System.out.println(" Withdrawal = " + s.getWithdrawal());
		System.out.println(" FundTransfer = " + s.getFundTransfer());
		System.out.println(" PayBill = " + s.getPayBill());
	}

}
