package com.rays.ExFour;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Q2Calendar73 {
	public static void main(String[] args) {
		
		Date d = new Date();
		SimpleDateFormat sdf =  new SimpleDateFormat();
		Calendar cal = Calendar.getInstance();
		cal.setTime(d);
		for(int i=1; i<=12;i++) {
			cal.add(Calendar.DATE, 30);
			System.out.println(sdf.format(cal.getTime()));
		}
		
	}

}
