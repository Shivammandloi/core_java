package com.rays.CollactionSet3;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEx1 {

	public static void main(String[] args) {
		  int i = 2;
		  Vector v = new Vector ();
		  v.add("ram");
		  v.add("shyam");
		  
		  Enumeration e = v.elements();
		  while(e.hasMoreElements()) {
			  System.out.println(e.nextElement());
			  if(i==2) {
				  v.add("raman");
				  i++;
				 v.remove(1);
			  }
		  }
             System.out.println(v);
	}

}
