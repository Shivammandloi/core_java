package com.rays.MethodOverloading1;

public class A_ShapeTest1 {
	public static void main(String[] args) {
		A_Shape1 as = new A_Shape1();
		as.area();
		as.area(10);

		System.out.println(" ");
		A_Rectangle1 ar = new A_Rectangle1();
		ar.area();
		ar.area(10, 40);
		
		
		System.out.println(" ");
		A_Circle1 ac = new A_Circle1();
		ac.sum();
		ac.sum(20);
		
		
		
		System.out.println(" ");
		A_Tringle1 at = new A_Tringle1();
		at.sub();
		at.sub(10, 10);
		}

}
