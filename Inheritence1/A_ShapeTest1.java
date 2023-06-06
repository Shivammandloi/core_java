package com.rays.oop.Inheritence1;

public class A_ShapeTest1 {
	public static void main(String[] args) {
		System.out.println("Shape Object 1  ");
		A_Shape1 s = new A_Shape1();
		s.setColor("Red");
		s.setBorderWidth(10);
		//System.out.println(s.getColor());
		//System.out.println(s.getBorderWidth());
		
		s.area();
		
		System.out.println("");
		System.out.println("Rectangle Object 2 ");
		
		A_Rectangle1 r = new A_Rectangle1();
		r.setLength(20);
		r.setWidth(40);
		//System.out.println(r.getLength());
		//System.out.println(r.getWidth());
		
		r.area();
		
		
		System.out.println("");
		System.out.println("Circle  Object 3 ");
		A_Circle1 c = new A_Circle1();
		c.setradius(10);
		//System.out.println(c.getRadius());
		c.area();
		
		
		System.out.println(" ");
		System.out.println("**** 4");
		A_Shape1 s2 = new A_Circle1();
		A_Circle1 c1 = (A_Circle1)s2;
			c1.setradius(20);  //PI*radius*radius
		    c1.area();
		
		
		    System.out.println(" ");
		System.out.println("&&&&& 5");
		A_Shape1 s3 = new A_Rectangle1();
		A_Rectangle1 r3 = (A_Rectangle1)s3;
		r3.setLength(10);
		r3.setWidth(50);
		r3.area();  //length*width
		
		
		
		
//		System.out.println("@@@@@@ 6");
//		Shape[] s1 = new Shape[2];
//		s1[0]=new Rectangle();
//		s1[1]= new Circle();
//		Rectangle r1 = (Rectangle)s1[0];
//		r1.setLength(10);
//		r1.setWidth(20);
//		
//		Circle c4 = (Circle)s1[1];
//		c4.setradius(10);
//		
//		double totalArea = 0;
//		for (int i = 0; i < s1.length; i++) {
//			totalArea = totalArea + s1[i].area();
//		}
//		System.out.println("Total Area =" + totalArea);
//		
		
		
	}

}
