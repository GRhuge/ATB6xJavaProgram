package ex_25May2024_Exceptions;

import java.io.FileInputStream;

public class Lab167_Checked_Exception {

	public static void main(String[] args) {
		// Checked exceptions
		try {
		FileInputStream fis = new FileInputStream("e:/abc.txt");
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		//Unchecked exceptions
	//	int a = 20;
	//	int c = a/0;
	}

}
