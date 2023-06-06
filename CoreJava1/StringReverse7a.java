package com.rays.CoreJava1;

public class StringReverse7a {
	public static void main(String[] args) {
		String name ="core java";
		String[] str = name.split(" ");
		for (int i = 0; i < str.length; i++) {
			for (int j = str[i].length()-1;j>=0; j--) {
				System.out.println(str[i].charAt(j));
			}
			System.out.println( " " );
		}
		
		
	}

}
