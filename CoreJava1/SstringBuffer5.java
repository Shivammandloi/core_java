package com.rays.CoreJava1;

public class SstringBuffer5 {
	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = "Java";
		String s3 = new String("Core");
		String s4 = new String("Core");
		System.out.println("string = "+ s1+s2);
		
		StringBuffer sb = new StringBuffer("Hello ");
			sb.append("Java");
			System.out.println("StringBuffer =" + sb);
	}

}
