package com.rays.ExFour;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class Q1Emplooyee73 {

	public static void main(String[] args) throws  ParseException {
		
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date dob = sdf.parse("27/04/1999");
		int ab= today.getYear();
		int c = dob.getYear();
		int cc= ab-c;
		System.out.println(cc);

	}

}
