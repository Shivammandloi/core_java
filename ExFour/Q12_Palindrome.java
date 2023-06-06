package com.rays.ExFour;

public class Q12_Palindrome {

	public static void main(String[] args) {
		  int a= 10981;
		 // System.out.println(a);
		  int s = a;
		  int remainder=0;
		  int p =0;
		  while (a>0) {
			  remainder = a%10;
			  a=a/10;
			  p=p*10+remainder;
			  
		  }
          System.out.println(a);
          System.out.println(p);
          
          if(s==p) {
        	  System.out.println("no is palindrom:" +p);
        	  
          }
	}

}
