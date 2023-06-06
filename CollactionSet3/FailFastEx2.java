package com.rays.CollactionSet3;

import java.util.Iterator;
import java.util.LinkedList;

public class FailFastEx2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
          LinkedList k = new LinkedList();
          k.add("ram");
          k.add("shivam");
          k.add("mandloi");
          k.add("indore");
          
        		  Iterator it =k.iterator();
        		  while(it.hasNext()) {
        			  System.out.println(it.next());
        		  
        		  k.add("rohit");
        		 k.remove(1);
        		 System.out.println(" size = " + k.size());
        		 System.out.println(" empty =" + k.isEmpty());
        }
        		  System.out.println(k);
	}
	
}
