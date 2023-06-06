package com.rays.CoreJava1;

public class ReverseNumber {
	public static void main(String[] args) {
		int number = 134;
		int r;
		int sum = 0;
		int n=number;
		while(n>0) {
			r=n%10;
			sum = (sum*10)+r;
			n=n/10;
		}
		System.out.println("Reverse = " + sum);
	}

}
