package ex_25May2024_Exceptions_usingThrow_Keyword;

import java.util.Scanner;

public class YoungerAgeException extends RuntimeException {
	YoungerAgeException(String msg){
		super(msg);
	}
}

