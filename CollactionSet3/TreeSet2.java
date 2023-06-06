package com.rays.CollactionSet3;

import java.util.TreeSet;

public class TreeSet2 {

	public static void main(String[] args) {
		 TreeSet  tr = new TreeSet();
		 tr.add(6);
		 tr.add(0);
		 tr.add(8);
		 tr.add(7);
      System.out.println(tr);
      
      for(Object it:tr) {
    	  System.out.println(it);
      }
      System.out.println(" first = " + tr.first());  //method hai
      System.out.println(" last = " + tr.last());
      System.out.println(" add =" + tr.add(0));
      tr.add(12);
      System.out.println(" tr = " + tr);
	}

}
