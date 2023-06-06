package com.rays.Java8;

import java.util.ArrayList;
import java.util.List;

public class I_ForEachLoop9 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("one");
		list.add("two");
		list.add("Three");
		list.add("Four");

		list.forEach(li -> System.out.println(li));

	}

}
