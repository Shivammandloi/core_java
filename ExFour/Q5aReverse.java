package com.rays.ExFour;

public class Q5aReverse {

	public static void main(String[] args) {
		int a= 975398246;
		int rever = 0;
		for (int i=9;i>=1;i--) {
			int remainder = a%10;
			rever = rever*10+ remainder;
			a=a/10;
			
		}
        System.out.println(rever);
	}

}
