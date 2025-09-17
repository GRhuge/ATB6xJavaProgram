package ex_23Apr2024_Conditional_Statements_IFelse;
import java.util.Scanner;

public class Lab076InterviewQuestion {

	public static void main(String[] args) {
		// Write a program for Grade Calculator
		// Write a program that calculates and displays the letter grade for a given
		// numerical score (e.g:- A, B, C, D, or F) based on the following
		// grade scale:
		
		// A: 90-100
		// B: 80-89
		// C: 70-79
		// D: 60-69
		// F: 0-59
		
		// 3 Steps to solve/write the program
		// Step 1:-
		// Find the user inputs
		// user will enter score - data type - int
		// return -> grade -> data type -> char
		// Ask the interviewer what is the data type of score
		
		// Step 2:-
		// if(Score >= 90 && score <= 100) -> return grade A
		// else if score <= 89 && score >= 80 -> return grade B
		// else -> grade F
		
		// Step 3:-
		// Write code
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Student score!!");
		int score = sc.nextInt();
		
		char grade = 'F';
		
		if(score >= 90 && score <= 100) {
			grade = 'A';
		}else if(score >= 80 && score <= 89) {
			grade = 'B';
		}else if(score >= 70 && score <= 79) {
			grade = 'C';
		}else if(score >= 60 && score <= 69) {
			grade = 'D';
		}else if(score > 100) {
			System.out.println("LOL!!");
		}
		else {
			grade = 'F';
		}
		
		System.out.println("Your Grade is -->" +grade);
		
		sc.close();
	}

}
