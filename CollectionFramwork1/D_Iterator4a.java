package com.rays.CollectionFramwork1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class D_Iterator4a {
	public static void main(String[] args) {
		Collection list = new ArrayList();
//		list.add("White");
//		list.add(100);
//		list.add(true);
//		list.add("Black");
		
		
		Iterator it = list.iterator();
		System.out.println("Boolean dega = " + it.hasNext());

	}

}
