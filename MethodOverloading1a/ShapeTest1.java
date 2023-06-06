package com.rays.MethodOverloading1a;

public class ShapeTest1 {
	public static void main(String[] args) {
		
		
		Shape1 s = new Shape1();
		s.area();
		s.area(10);
		
		System.out.println(" ");
		Rectangle1 r = new Rectangle1();
		r.area();
		r.area(10, 20);
		
		
		System.out.println(" ");
		Circle1 c = new Circle1();
		c.sum();
		c.sum(10);
		
		
		System.out.println(" ");
		Tringle1 t = new Tringle1();
		t.sub();
		t.sub(10, 30);
		
		
	}

}
