package com.rays.IO1;

import java.io.FileWriter;
import java.io.IOException;

public class D_WriteTextFile4a {
	public static void main(String[] args) throws Exception {

		FileWriter out = new FileWriter("C:\\Users\\DELL\\Desktop\\Io\\Aadesh.txt", true);
		out.write('S');
		out.write("mandloi");
		out.write("khargone");
		out.close();
		System.out.println("Check C:C:\\\\Users\\\\DELL\\\\Desktop\\\\Io\\\\Aadesh.txt");
	}

}
