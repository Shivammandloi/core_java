package com.rays.IO1;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class G_EmployeedeserializationTest11c {
	public static void main(String[] args) throws Exception {
		FileInputStream file = new FileInputStream("C:\\\\Users\\\\DELL\\\\Desktop\\\\Io\\\\ji.txt");
		ObjectInputStream in = new ObjectInputStream(file);

		G_Employee11a e = (G_Employee11a) in.readObject();
		System.out.println(" Id = " + e.id);
		System.out.println(" firstName = " + e.firstName);
		System.out.println(" lastName = " + e.lastName);
		System.out.println(" salary = " + e.salary);

		in.close();
		file.close();
	}

}
