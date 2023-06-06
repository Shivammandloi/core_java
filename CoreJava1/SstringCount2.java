package com.rays.CoreJava1;

public class SstringCount2 {
	public static void main(String[] args) {
		String s = "hello java";
				char c  = 'a';
				int count =0;
				for (int i=0; i<s.length(); i++) {
					if(s.charAt(i)==c) {
						count++;
					}
				}
				System.out.println("count of char = " + count);
	}

}
