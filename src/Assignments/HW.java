package Assignments;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// Program to check if a number is positive, negative or zero
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("Positive number");
		}
		else if(num<0)
		{
			System.out.println("Negative number");
		}
		else
		{
			System.out.println("Zero");
		}
		sc.close();
	}

}
