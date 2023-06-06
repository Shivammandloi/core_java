package com.rays.Java8;

public class B_FunParameterTest2a {
	public static void main(String[] args) {
		B_FunParameter2 fn = new B_FunParameter2() {

			@Override
			public void sum(int a , String b) {
				System.out.println(" Hello perameter Anonymous Function = " + (a+" "+b));
			}

		};
		fn.sum(20 , "Shivam");

	}

}
