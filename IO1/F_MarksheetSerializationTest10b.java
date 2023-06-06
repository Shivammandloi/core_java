package com.rays.IO1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class F_MarksheetSerializationTest10b {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Io\\Ram.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		F_Marksheet10a m = new F_Marksheet10a();
		m.name = "Shivam";
		m.physics = 20;
		m.chemistry = 20;
		m.maths = 20;
		m.total = m.physics + m.chemistry + m.maths;

		out.writeObject(m);
		out.close();
		file.close();
	}

}
