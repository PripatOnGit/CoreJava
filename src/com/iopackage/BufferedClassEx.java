package iopackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedClassEx {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFile.txt"));
		BufferedWriter bw = new BufferedWriter(new FileWriter("D://Priyanka/WEB_DEV/CoreJava/Day10(5Dec22)-Packages/DemoFileBufferedFile.txt"));
		String line;
		while((line=br.readLine())!= null) {
			bw.write(line);
			bw.newLine();
		}
	br.close();
	bw.close();
	}
}
