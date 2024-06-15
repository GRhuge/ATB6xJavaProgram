package ex_4May2024_ArraysPart2;

import java.util.Scanner;

public class Lab135_Pallindrome_InterviewQ {

	public static void main(String[] args) {
		// Pallindrome - Is a String
		// Naman -> Reverse -> Naman , 1331 -> Reverse -> 1331, madam -> Reverse -> madam
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string, I will check if it is pallindrome or not");
		String user_input = sc.next();
		
		StringBuilder sb = new StringBuilder(user_input);
		String rev_user_input = sb.reverse().toString();
		if(user_input.equalsIgnoreCase(rev_user_input)) {
			System.out.println("Pallindrome -> " + user_input);
		}
		else {
			System.out.println("Nope");
		}
	}

}
