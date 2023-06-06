package com.rays.CollactionSet3;

import java.util.TreeSet;

public class TreeSet1 {

	public static void main(String[] args) {
		  TreeSet s = new TreeSet();
		  s.add("h");
		  s.add("j");
		  s.add("l");
		  s.add("5");
		  s.add("null");
		  s.add("null");
		  System.out.println(" s = " + s);
		  for(Object ele:s) {
			  System.out.println(ele);
		  }
		  //Duplicate element being removed  //duplicate ko print nhi karega
		  s.add("Three");
		  System.out.println(" s1 =" + s);

	}

}
