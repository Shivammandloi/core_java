package com.rays.CoreJava1;

public class Object3 {
	public static int sum(int a ,int b) {  //static method
		int c = a+b;
		System.out.println("sum ="+c);
		return c;
	}
	public static int milt() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j+"\t");
				//System.out.print(j);
				System.out.print("*");
			}
			System.out.println();
		}
		return 0;

	}
	
	public static int abc(int a) {
		for(int i=1;i<=a;i++) {
			for(int j=1;j<=i;j++) {
				//System.out.print(j+"\t");
				System.out.print(j);
				//System.out.print("*");
			}
			System.out.println();
		}
		return 0;

	}

}
