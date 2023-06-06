package com.rays.CollactionSet3;

import java.util.Enumeration;
import java.util.Vector;

public class EmumerationEx3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		Vector r = new Vector();
		r.add("ram");
		r.add("shyam");
		r.add("shivam");
		r.add("mandloi");
		r.add("rom");

		Enumeration e = r.elements();
		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		if (a == 5) {
			r.add("sharma");
			r.remove(2);

		}
		System.out.println(r);
	}

}
