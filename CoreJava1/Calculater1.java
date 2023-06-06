package com.rays.CoreJava1;

public class Calculater1 {
	public static void main(String[] args) {
		int a = 25;
		int b = 52;
		int c = 75;
		int d = 12;

		switch (d) {
		case 1:
			int e = a + b;
			System.out.println("add = " + e);
			break;

		case 2:
			int f = b - d;
			System.out.println("sub = " + f);
			break;

		case 3:
			int g = c * d;
			System.out.println("mult = " + g);
			break;

		case 4:
			int h = b / c;
			System.out.println("div = " + h);
			break;

		case 12:
			int k = c % d;
			System.out.println("modulos = " + k);
			break;

		default:
			System.out.println("nill");
			break;

		}

	}

}
