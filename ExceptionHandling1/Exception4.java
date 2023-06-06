package com.rays.ExceptionHandling1;

public class Exception4 {
	public static void main(String[] args) {
		try {
		String name = null;
		
		System.out.println("length ="+name.length());
		System.out.println("Character ="+name.charAt(6));
		}catch(StringIndexOutOfBoundsException e){
			System.out.println("String Exception ="+e.getMessage());
		}catch(NullPointerException e){
			System.out.println("Null Exception ="+e.getMessage());
		}catch(Exception e){
			System.out.println("Exception ....ook");
		}
	}
	

}
