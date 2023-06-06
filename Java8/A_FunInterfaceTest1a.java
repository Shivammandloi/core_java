package com.rays.Java8;

public class A_FunInterfaceTest1a {

	public static void main(String[] args) {
		A_FunInterface1 fn = new A_FunInterface1() {

			@Override
			public void show() {
				// TODO Auto-generated method stub
				System.out.println(" Anonymous Function.... ");

			}

		};

		fn.show();

	}

}
