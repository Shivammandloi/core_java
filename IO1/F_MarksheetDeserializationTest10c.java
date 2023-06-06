package com.rays.IO1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class F_MarksheetDeserializationTest10c {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\Io\\\\Ram.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		F_Marksheet10a m = (F_Marksheet10a) in.readObject();
		System.out.println(" Name = " + m.name);
		System.out.println(" Physics = " + m.physics);
		System.out.println(" Chemistry = " + m.chemistry);
		System.out.println(" Maths = " + m.maths);
		System.out.println(" Total = " + m.total);

		in.close();
		file.close();
	}

}
