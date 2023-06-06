package com.rays.ExFour;

public class Question8 {

	public static void main(String[] args) {
		int[][] a = new int[11][11];
		for(int i=1;i<a.length;i++) {
			for (int j = 0; j < a.length; j++) {
				a[i][j]=i*j;
			}
		}
		for (int i = 1; i < a.length; i++) {
			for (int j = 1; j < a.length; j++) {
				System.out.print(a[i][j]+"\t");
			}
			System.out.println();
		}
	    

	}

}
