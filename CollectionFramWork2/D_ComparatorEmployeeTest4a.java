package com.rays.CollectionFramWork2;

import java.util.ArrayList;
import java.util.Collections;

import com.rays.CollectionFramwork1.A_ArrayList1;

public class D_ComparatorEmployeeTest4a {
	public static void main(String[] args) {
		D_ComparatorEmployee4 em = new D_ComparatorEmployee4(1 , "Pradeep" , 23);
		D_ComparatorEmployee4 em1 = new D_ComparatorEmployee4(2 , "Aadesh" , 34);
		D_ComparatorEmployee4 em2 = new D_ComparatorEmployee4(3 , "Patel" , 43);
		D_ComparatorEmployee4 em3 = new D_ComparatorEmployee4(4 , "Mandloi" , 24);
		D_ComparatorEmployee4 em4 = new D_ComparatorEmployee4(6 , "khargone" , 98);
		D_ComparatorEmployee4 em5 = new D_ComparatorEmployee4(5 , "indore" , 31);
		
		ArrayList list = new ArrayList();
		list.add(em);
		list.add(em1);
		list.add(em2);
		list.add(em3);
		System.out.println(list);
		Collections.sort(list,new OByName());
		for (Object object : list) {
			System.out.println(object);
		}
		
		
		
		System.out.println("@@@@@");
		
		
		
		ArrayList list1 = new ArrayList();
		list1.add(em4);
		list1.add(em5);
		Collections.sort(list1,new OrderById());
		for (Object object : list1) {
			System.out.println("id = " + object);
			
		}
		}

}
