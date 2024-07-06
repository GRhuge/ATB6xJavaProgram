package ex_25May2024_Exceptions_usingThrows_Keyword;

import java.io.FileNotFoundException;

public class Test {

	public static void main(String[] args) {
		ReadAndWrite rw = new ReadAndWrite();
		try {
		rw.readfile();
		}catch(FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("krsna");
	}

}
