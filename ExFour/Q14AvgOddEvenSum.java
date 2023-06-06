package com.rays.ExFour;

public class Q14AvgOddEvenSum {

	public static void main(String[] args) {
		
		//Sum of Consecutive N Odd number
		int odd = 15;
		int sum = 0;
		for(int i = 1;i<=odd;i++) {
			System.out.println(i);
			sum = sum + i;
		}
		   System.out.println("Sum of odd ="+sum);
		   
		   
		   
		   
		   // Sum of Consecutive N Even number
		   int even = 20;
		   int sum1 = 0;
		   for(int a = 2; a<=even;a=a+2) {
			   System.out.println(a);
			   sum1 = sum1 + a;
		   }
		   System.out.println("Sum of Even = " + sum1);
	}

}
