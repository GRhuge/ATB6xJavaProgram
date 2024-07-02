package ex_25May2024_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab172 {
	public static void main(String[] args)throws FileNotFoundException {
		readfile("C://a.txt");
	}
	
	static void readfile(String fileName) throws FileNotFoundException {
		int a =10/10;
		int c =0;
		int a1 = 10/c;
		try {
		FileReader f = new FileReader("C://a.txt");
		}catch(Exception e) {
			System.out.println("file not found");
		}
		FileReader f = new FileReader("C://a.txt");
	}
}
