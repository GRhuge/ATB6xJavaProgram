package ex_25May2024_Exceptions;

import java.io.File;
import java.io.FileReader;

public class Lab171 {

	public static void main(String[] args) {
		try {
		String path = "C://a.txt";
		File fis = new File(path);
		FileReader fi = new FileReader(fis);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
