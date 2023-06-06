package com.rays.CollectionFramwork1;

import java.util.ArrayList;

public class A_ArrayList1 {
	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		list.add("White");
		list.add(100);
		list.add(true);
		list.add("Black");
		
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
		}
	}

}
