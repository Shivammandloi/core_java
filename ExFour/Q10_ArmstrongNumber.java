package com.rays.ExFour;

public class Q10_ArmstrongNumber {

	public static void main(String[] args) {
		  int n=13;
		  int arm=0;
		  int rem;
		  int c=n;  
		  while(n>0) {
			  rem=n%10;
			  arm=(rem*rem*rem)+arm;
//			  arm+=(rem*rem*rem);
			  n=n/10;
		  }
		  if(c==arm) {
			  System.out.println("armstrong number");
			  
		  }else {
			  System.out.println("not armstrong number");
		  }
	}

}
