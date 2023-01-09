package com.iopackage;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class IoClass2 {
	public static void main(String[] args) throws IOException {
		FileReader fis = new FileReader("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFile.txt");
		FileWriter fos = new FileWriter("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFileNewFile.txt");
		int c;
		while((c=fis.read())!= -1) {
			fos.write(c);
		}
	fis.close();
	fos.close();
	}
}
