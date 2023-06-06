package com.rays.CollectionFramwork1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class D_Iterator4 {
	public static void main(String[] args) {
		Collection list = new ArrayList();
		list.add("White");
		list.add(100);
		list.add(true);
		list.add("Black");
		
		
		Iterator it = list.iterator();            //iteratore method
	     System.out.println("Boolean dega = " + it.hasNext());
	     
         //while(it.hasNext()) {
     	//	System.out.println(it.next());
     	//Employee7 list1 = (Employee7)it;
     //	System.out.println(li);
//     	System.out.println(list1.getId());
//    	System.out.println(list1.getName());
//     	System.out.println(list1.getAge());
	//}
		for (Object object : list) {
			System.out.println(object);
		}
		

	}

}
