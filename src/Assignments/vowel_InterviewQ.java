package Assignments;

import java.util.Scanner;

public class vowel_InterviewQ {

	public static void main(String[] args) {
		// Program to check char is vowel or consonant
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
		   || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U')
		{
			System.out.println("Vowel");
		}
		else
		{
			System.out.println("Consonant");
		}
	}

}
