package com.rays.IO1;

import java.io.FileWriter;
import java.io.IOException;

public class D_WriteTextFile4 {
	public static void main(String[] args) throws Exception {
		FileWriter out = new FileWriter("C:\\Users\\DELL\\Desktop\\Io\\newfile.txt");
		out.write('A');
		out.write("This is a line hut66");
		out.close();
		System.out.println("check C:\\Users\\DELL\\Desktop\\Io\\newfile.txt ");

	}

}
