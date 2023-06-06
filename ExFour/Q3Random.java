package com.rays.ExFour;

import java.util.Random;

public class Q3Random {
	public static void main(String[] args) {
			
		// Math.random()*100;
		  Random rand = new Random();
		for (int i = 0; i < 10; i++) {
			System.out.println(Math.random() * 100);
		}
	}
}
