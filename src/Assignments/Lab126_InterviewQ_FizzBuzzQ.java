package Assignments;

import java.util.Scanner;

public class Lab126_InterviewQ_FizzBuzzQ {

	public static void main(String[] args) {
		// Fizz Buzz Program
		// Write a program that prints number from 1 to 100.
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println("The fizz, buzz, and fizzbuzz numbers are");
		for(int i = 1; i <= 50; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println("FizzBuzz");
			} else if(i % 3 == 0){
				System.out.println("Fizz");
			} else if(i % 5 == 0) {
				System.out.println("Buzz");
			} else {
				System.out.println(i);
			}
		}

	}

}
