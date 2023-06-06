package com.rays.Java8;

public class E_FunDefaultTest5a {
	public static void main(String[] args) {
		E_FunDefault5 f = new E_FunDefault5() {

			@Override
			public void mult() {
				System.out.println("default aa gya Normal.....");
				
			}
			
		};
		f.mult();
	}

}
