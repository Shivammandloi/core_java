package com.rays.CollectionFramwork1;

import java.util.HashMap;

public class I_InterfaceMap9 {
	public static void main(String[] args) {
		
		HashMap h = new HashMap();
		h.put(1,"Shivam");
		h.put(2 , 12);
		h.put(4 , "mandloi");
		System.out.println(h.get(4));
//		h.clear();
//		System.out.println("clear = " +h);

		h.containsKey(h);
		System.out.println("containsKey = " + h);
	}

}
