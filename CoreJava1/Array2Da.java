package com.rays.CoreJava1;

public class Array2Da {
	public static void main(String[] args) {
		int[][] table = new int[11][11];
		for (int i = 1; i < table.length; i++) {
			for (int j = 1; j < table.length; j++) {
				table [i][j]=i*j;
			}
			
		}
		for (int[] is : table) {
			for(int i : is) {
				System.out.print(i+"\t");
				
			}
			System.out.println();
			
		}
	}

}
