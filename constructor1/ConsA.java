package com.rays.oop.constructor1;

public class ConsA {
      private String Fname;
      private String Lname;
      private int id;

    public String getFname() {
	   return Fname;
}	
    public String getLname() {
    	return Lname;
    } 
    public int getid() {
    	return id;
    }
    
    
       //parmeterized constrocter
    public ConsA(String Fname, String Lname, int id) {
    	this.Fname = Fname;
    	this.Lname = Lname;
    	this.id = id;
    }
    
    
       // default constrocter
    public  ConsA() {
    	super();
    }
    
}



