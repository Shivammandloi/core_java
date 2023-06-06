package com.rays.IO1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class E_MarksheetSerialization9b {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Io\\Rom.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		E_Marksheet9a m = new E_Marksheet9a();
		m.name = "Mandloi";
		m.physics = 21;
		m.chemistry = 21;
		m.maths = 21;

		out.writeObject(m);
		out.close();
		file.close();
	}

}
