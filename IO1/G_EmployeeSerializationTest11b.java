package com.rays.IO1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class G_EmployeeSerializationTest11b {
	public static void main(String[] args) throws Exception {
		FileOutputStream file = new FileOutputStream("C:\\Users\\DELL\\Desktop\\Io\\ji.txt");
		ObjectOutputStream out = new ObjectOutputStream(file);

		G_Employee11a e = new G_Employee11a();
		e.id = "1";
		e.firstName = "Shivam Mandloi";
		e.lastName = "Mandloi Shivam";
		e.salary = 1000;

		out.writeObject(e);
		out.close();
		file.close();

	}

}
