package com.rays.IO1;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class A_ReadTextFile1a {
	public static void main(String[] args) throws Exception {

		try (FileReader in = new FileReader("C:\\Users\\DELL\\Desktop\\Io\\Hello.txt")) {
			int ch = in.read();
			while (ch != -1) {
				// System.out.println("Ascii value = " + ch);
				System.err.print((char) ch);
				ch = in.read();

			}
		} // try block end
	}

}
