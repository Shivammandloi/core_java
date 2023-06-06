package com.rays.CollactionSet3;

import java.util.Iterator;
import java.util.LinkedList;

public class FailFastEx1 {
	public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.add("Ram");
		l.add("Raman");
		l.add("Raghav");

		Iterator it = l.iterator();
		while (it.hasNext()) {
			Object o = (Object) it.next();

			System.out.println(o);

			l.add("shyam"); // fail-fast
			l.remove("Ram");

		}

		System.out.println(l);
	}

}