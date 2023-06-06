package com.rays.ExFour;

import java.util.Random;

public class Q3aRandom {
	public static void main(String[] args) {
		
		Random rand = new Random();
		for(int i=0; i<10;i++) {
			int a = (int)(Math.random()*100);
			System.out.println(a);
		}
		
	}

}
