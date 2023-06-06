package com.rays.CollectionFramwork1;

import java.util.Enumeration;
import java.util.Vector;

public class F_IteratorEnumeration6 {
	public static void main(String[] args) {
		Vector v = new Vector();
		
		v.add("White");
		v.add(100);
		v.add(true);
		v.add("Black");
		v.add("Pradeep");
		v.add("mandloi");
		Enumeration v1 = v.elements();
		while(v1.hasMoreElements()) {
			System.out.println(v1.nextElement());
		}
	}

}
