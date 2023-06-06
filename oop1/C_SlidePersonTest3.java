package com.rays.oop1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class C_SlidePersonTest3 {
	public static void main(String[] args) throws ParseException {
		C_SlidePerson3 s = new C_SlidePerson3();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		s.setStr("mandloi");
		s.setD(sdf.parse("27/04/1999"));
		s.setAddress("Bhopal");
		
		
		
		System.out.println(s.getStr());
		System.out.println(s.getD());
		System.out.println(s.getAddress());
		System.out.println(s.getAVG_AGE());
	}

}
