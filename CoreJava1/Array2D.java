package com.rays.CoreJava1;

public class Array2D {
	public static void main(String[] args) {
		int[][] table = new int[5][5];
		table[0][0]=1;
		table[0][1]=2;
		table[0][2]=3;
		table[0][3]=4;
		table[0][4]=5;
		
		
		table[1][0]=1;
		table[1][1]=2;
		table[1][2]=3;
		table[1][3]=4;
		table[1][4]=5;
		
//		for (int i = 0; i < table.length; i++) {
//			for (int j = 0; j < table.length; j++) {
//			table[i][j]=i*j;
//				System.out.print(i*j+"\t");
//			}
//			System.out.println();
//		}
		
		
		
		for (int[] is : table) {
			System.out.println(is[0]);
		}
		
	}

}
