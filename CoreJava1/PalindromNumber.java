package com.rays.CoreJava1;

public class PalindromNumber {
	public static void main(String[] args) {
		int number = 121;
		int r;
		int sum = 0;
		int n = number;
		while(n>0) {
			r=n%10;
			sum=(sum*10)+r;
			n=n/10;
		}
		if(number==sum) {
			System.out.println("palindrom Number ="+sum);
		}else {
			System.out.println(" Not a palindrom Number ="+ sum);
		}
	}

}
