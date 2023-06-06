package com.rays.CoreJava1;

public class ArmostrongNumber {
	public static void main(String[] args) {
		int number = 153;
		int r;
		int sum = 0;
		int n = number;
		while (n > 0) {
			r = n % 10;
			sum = sum + (r * r * r);
			n = n / 10;
		}
		if (sum == number) {
			System.out.println("Armostrong Number");
		}else {
			System.out.println("Not Armostrong Number");
		}
	}

}
