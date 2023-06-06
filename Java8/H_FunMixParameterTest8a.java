package com.rays.Java8;

public class H_FunMixParameterTest8a {
	public static void main(String[] args) {
		H_FunMixparameter8 fm = new H_FunMixparameter8() {

			@Override
			public void show() {
				System.out.println("show Method..");

			}

			@Override
			public void sum(int c, int d) {
				// TODO Auto-generated method stub
				System.out.println("May default method....." + (c * d));

			}

		};
		fm.sum(10, 20);
		H_FunMixparameter8.mult("Shivam", "Mandloi");
	}

}
