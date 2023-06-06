package com.rays.CoreJava1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateStringChangeDate3 {
	public static void main(String[] args) throws ParseException {
		
		String dob = "27/04/1999";
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date d=sdf.parse(dob);
		System.out.println(d);
		
	}

}
