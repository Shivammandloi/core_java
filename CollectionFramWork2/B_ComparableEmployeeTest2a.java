package com.rays.CollectionFramWork2;

import java.util.ArrayList;
import java.util.Collections;

public class B_ComparableEmployeeTest2a {
	public static void main(String[] args) {

		B_ComparableEmployee2 e = new B_ComparableEmployee2(1, "shivam", 24);
		B_ComparableEmployee2 e2 = new B_ComparableEmployee2(1, "shivam", 24);
		B_ComparableEmployee2 e3 = new B_ComparableEmployee2(3, "mandloi", 24);
		B_ComparableEmployee2 e4 = new B_ComparableEmployee2(4, "dada", 24);

		ArrayList l = new ArrayList();
		l.add(e);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		System.err.println("equal = " + e.equals(e2)); // equal method

		Collections.sort(l); // sorting method
		for (Object object : l) {
			System.out.println(object);

		}
	}

}
