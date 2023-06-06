package com.rays.IO1;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class C_ReadTextScanner3 {
	public static void main(String[] args) throws Exception {

		FileReader reader = new FileReader("C:\\Users\\DELL\\Desktop\\Io\\shihore.txt");
		Scanner s = new Scanner(reader);

		while (s.hasNext()) {
			System.out.println(s.nextLine());
		}
		reader.close();
	}

}
