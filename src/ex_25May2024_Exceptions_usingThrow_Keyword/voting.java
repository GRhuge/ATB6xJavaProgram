package ex_25May2024_Exceptions_usingThrow_Keyword;

import java.util.Scanner;

class voting{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		try {
		if(age<18) {
			throw new YoungerAgeException("You are not eligible for voting");
		}	
		else {
			System.out.println("You can vote successfully");
		}
	 }
		catch(YoungerAgeException e) {
			e.printStackTrace();
		}
		System.out.println("hola");
	}
}