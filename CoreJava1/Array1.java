package com.rays.CoreJava1;

public class Array1 {
	public static void main(String[] args) {
		int[] table = {2,4,6,8,10};
		System.out.println("index No = " + table[2]);
		
		
		
		
//		int[] table2 = new int[5];
//		table2[0]=2;
//		table2[1]=4;
//		table2[2]=6;
//		table2[3]=8;
//		table2[4]=10;
//		for (int i : table2) {
//			System.out.println(i);
//			
//		}
		
		
		
		
		int[] table3 = new int[5];
		for(int i=0;i<table3.length;i++) {
			table3[i]=i;
			for (int i1 : table3) {
				System.out.print(i1+"\t");
				
			}
			System.out.println();
		}
		
	}

}
