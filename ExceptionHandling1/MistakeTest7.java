package com.rays.ExceptionHandling1;

public class MistakeTest7 {
	public static void main(String[] args) throws Mistake7 {
		dad();
		//System.out.println("dad");
	}

	private static void dad() throws Mistake7 {
		mom();
		//System.out.println("mom");
	}

	private static void mom() throws Mistake7 {
	
		son();	
		//System.out.println("son");
	}

	private static void son() throws Mistake7 {
		Mistake7 e = new Mistake7("galti ho gai");
		//System.out.println("son 1");
		throw e;
	}
	
	
	
//	private static void son() throws Mistake7 {
//		Mistake7 e = new Mistake7();
//		//System.out.println("son 1");
//		throw e;
//		
//	}

	

}
