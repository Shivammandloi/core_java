package com.rays.CoreJava1;

public class SstringPettern3a {
	public static void main(String[] args) {
		for(int i=1;i<=5; i++) {
			for(int j=5;j>=i;j--) {
				//System.out.print(j+"\t");
				//System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
