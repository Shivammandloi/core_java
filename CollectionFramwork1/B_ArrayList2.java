package com.rays.CollectionFramwork1;

import java.util.ArrayList;
import java.util.Collection;

public class B_ArrayList2 {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("White");
		list.add(100);
		list.add(true);
		list.add("Black");
		System.out.println("list print ="+list);
		
//		for (int i = 0; i < list.size(); i++) {
//			System.out.println(list);
//			
//		}
		
		Collection list1 = new ArrayList();
		list1.add("Cyan");
		list1.add(100);
		list1.add(true);
		list1.add("Gold");
		
		//System.out.println("list1 printe ="+list1);
		
		list.addAll(list1);
		System.out.println("addAll ="+list);
//		
//		list1.clear();
//		System.out.println("clear ="+list1);
		
		System.out.println("contains = "+list1.contains("Cyan"));
		list1.contains(list1);
		System.out.println("contains ="+list1.contains("Can"));
		
		list1.containsAll(list1);
		System.out.println("containsAll ="+list1);
		
		
		System.out.println("isEmpty ="+list1.isEmpty());
		
	
		//System.out.println("Remove ="+list1.remove("Cyan"));
		//System.out.println("list1 Print Remove ="+list1);
		
		//System.out.println("RemoveAll ="+list1.removeAll(list1));
		//System.out.println("list1 print RemoveAll = " + list1);
		
		list1.retainAll(list1);
		System.out.println("retainAll = "+ list1);
		
		
		System.out.println("size = " +list1.size());
		
		
	}

}
