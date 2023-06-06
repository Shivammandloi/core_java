package com.rays.CoreJava1;

public class TypeCastSmalltoBig1 {
	public static void main(String[] args) {
		
		int i=100;
		int a=10;
		short s=12;
		
		long l=i;
		float f=a;
		int b=s;
		System.out.println("int change long="+ l );
		System.out.println("int change float="+ f );
		System.out.println("short change int="+ b );
	}

}
