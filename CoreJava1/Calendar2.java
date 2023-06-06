package com.rays.CoreJava1;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Calendar2 {
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	    Date d = new Date();
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(d);
	    cal.add(Calendar.DATE, 10);
	   // System.out.println(cal.getTime());
	    System.out.println(sdf.format(cal.getTime()));
	    
	}

}
