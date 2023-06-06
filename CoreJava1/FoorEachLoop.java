package com.rays.CoreJava1;

public class FoorEachLoop {
//	public static void main(String[] args) {
//		int[] table = {11,23,34,45,56,67};
//		System.out.println(table[0]);  //Array ki index value
//		System.out.println(table.length);  //Array ki lenght
//		
//	}
//
	
	
	
	
	public static void main(String[] args) {
		int sum = 0;
		int[] table = {11,23,34,45,76};
		for(int i=0; i<table.length; i++) {
			System.out.println(table[i]);
			sum = sum + table[i];
		}
		System.out.println("sum =" + sum);
	}
}
