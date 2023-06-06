package com.rays.CollectionFramWork2;

import java.util.ArrayList;
import java.util.Collections;

public class C_ComparatorEmployeeTest3a {
	public static void main(String[] args) {

		C_ComparatorEmployee3 e = new C_ComparatorEmployee3(1, "shivam", 128);
		C_ComparatorEmployee3 e2 = new C_ComparatorEmployee3(1, "shivam", 128);
		C_ComparatorEmployee3 e3 = new C_ComparatorEmployee3(3, "Aadeh", 24);
		C_ComparatorEmployee3 e4 = new C_ComparatorEmployee3(4, "Pradeep", 23);

		ArrayList l = new ArrayList();
		l.add(e);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		System.out.println(e.hashCode());
		System.out.println(e2.hashCode());
		System.err.println("equals = " + e.equals(e2)); // equals method
		

		Collections.sort(l, new OrderByName()); // sorting method
		for (Object object : l) {
			System.out.println(object);

		}
	}

}
