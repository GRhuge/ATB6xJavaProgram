package ex_25May2024_Exceptions_usingThrows_Keyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class ReadAndWrite {
	void readfile() throws FileNotFoundException {
		FileInputStream fis = new FileInputStream("E:/abc.txt");
	}
	
	void savefile() throws FileNotFoundException {
		String text = "this is demo";
		FileOutputStream fos = new FileOutputStream("E:/xyz.txt");
	}
}
