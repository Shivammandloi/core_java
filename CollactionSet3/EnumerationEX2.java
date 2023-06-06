package com.rays.CollactionSet3;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationEX2 {

	public static void main(String[] args) {
		 int a = 4;
		 Vector s = new Vector();
		 s.add("shivam");
		 s.add("mandloi");
          s.add("mom");
          s.add("dad");
          System.out.println(s);
          Enumeration d = s.elements();
          while(d.hasMoreElements()) {
        	  System.out.println(d.nextElement());
          }
          if(a==4) {
        	  
			s.add("as");   //mathod hai
        	 // a++;
        	  s.remove(1);
        	 // s.clear();
        	  System.out.println("Empty = " + s.isEmpty());
        	  System.out.println( "Array ke andhar ka bcha huaa data aayega "+s.clone());
        	  System.out.println( "capacity "+ s.capacity());
        	  System.out.println( "contain "+s.contains("mom"));
        	  System.out.println("first"+ ":"+s.firstElement());
        	 
          }
          System.out.println(s);
	}

}
