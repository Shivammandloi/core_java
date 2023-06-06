package com.rays.IO1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class E_MarksheetDeserialization9c {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\Io\\\\Rom.txt");
		ObjectInputStream in = new ObjectInputStream(file);
		
		E_Marksheet9a m = (E_Marksheet9a) in.readObject();
		System.out.println(" Name = " + m.name);
		System.out.println(" Physics = " + m.physics);
		System.out.println(" Chemistry = " + m.chemistry);
		System.out.println(" Maths = " + m.maths);
		
		
		in.close();
		file.close();
	}


}
