package com.rays.ExceptionHandling1;

public class Exception3 {
	public static void main(String[] args) {
		try {
			String name = null;
			name = "rays";

			System.out.println("before");
			System.out.println(name.charAt(4));
			System.out.println("after 1");

		} catch (Exception e) {
			System.out.println("Exeption hai.....");
		} finally {
			System.out.println("Finally Block...");
		}
		System.out.println("after");
	}
}
