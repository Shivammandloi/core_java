package com.rays.CoreJava1;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateChangeString2 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		//System.out.println(d);
		String s=sdf.format(d);
		System.out.println(s);

}
}
