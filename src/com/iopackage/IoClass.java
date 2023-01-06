package iopackage;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.FileOutputStream;

public class IoClass {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFile.txt");
		FileOutputStream fos = new FileOutputStream("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFileNew.txt");
		int c;
		while((c=fis.read())!= -1) {
			fos.write(c);
		}
	fis.close();
	fos.close();
	}
}
