package com.rays.Java8;

public class D_FunLambdaTest4a {

	public static void main(String[] args) {
		D_FunLambda4 fn = new D_FunLambda4() {

			@Override
			public void sum() {
				System.out.println(" Normal... ");

			}
		};
		fn.sum();
		
		
		
		D_FunLambda4 f = ()->{
			System.out.println(" Normal and Lambda Function..... ");
		};
		f.sum();
	}

}
