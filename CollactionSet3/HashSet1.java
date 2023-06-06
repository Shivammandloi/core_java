package com.rays.CollactionSet3;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		  HashSet h = new HashSet();
		  h.add("ram");
		  h.add("rom");
		  h.add("shyam");
		  h.add("shivam");
		  h.add(2);
		  h.add("ram");
		  h.add(null);
		  h.add(null);
		  System.out.println(" h = " + h);
		  
		  //duplicate remove
		  h.add("ram");
		  for(Object ele :h) {
			  System.out.println(ele);
		  }

	}

}
