package com.rays.ExFour;

public class Q17 {
	public static void main(String[] args) {
		int [] a = {1 , 2 , 3 , 5 , 6};
		int [] b = {1 , 2 , 3 , 4 , 5 , 6};
		int sum = 0;
		for(int i = 0; i<a.length; i++) {
			sum =  sum + a[i];
		}
		System.out.println(sum);
		int sum1 = 0;
		for(int i = 0;i<=6; i++) {
			sum1 = sum1 + i;
		}
		System.out.println(sum1);
		System.out.println(sum1 - sum1);
	}

}
