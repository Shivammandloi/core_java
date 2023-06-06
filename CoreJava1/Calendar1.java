package com.rays.CoreJava1;

import java.util.Calendar;
import java.util.Date;

public class Calendar1 {
	public static void main(String[] args) {
		
		Date today = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(today);
		//cal.add(Calendar.DATE, 10);
		cal.add(Calendar.DATE, -10);
		System.out.println(cal.getTime());
		}

}
