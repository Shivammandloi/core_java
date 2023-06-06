package com.rays.CoreJava1;

public class Sstring1a {
	public static void main(String[] args) {
		String name = "Vijay Dinanath Chauhan";
		System.out.println("Length ="+name.length());
		System.out.println("character ="+name.charAt(6));
		System.out.println("Dina index is ="+name.indexOf("Dina"));
		System.out.println("First i Position ="+name.indexOf("i"));
		System.out.println("Last i Position ="+name.lastIndexOf("i"));
		System.out.println("a is replaced by b ="+name.replace("a","b"));
		System.out.println("Chhota vijay ="+name.toLowerCase());
		System.out.println("Bada vijay ="+name.toUpperCase());
		System.out.println("Starts With Vijay="+name.startsWith("Vijay"));
		System.out.println("Ends With Vijay ="+name.endsWith("han"));
		System.out.println("Substring ="+name.substring(6));
	}

}
