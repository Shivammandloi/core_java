package com.rays.IO1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class B_ReadtextFile2 {
	public static void main(String[] args) throws Exception {
		// Read a file "line by line"
		FileReader file = new FileReader("C:\\Users\\DELL\\Desktop\\Io\\pradeep.txt");
		BufferedReader in = new BufferedReader(file);

		String line = in.readLine();

		while (line != null) {
			System.out.println(line);
			line = in.readLine();

		}
		in.close();
	}

}
