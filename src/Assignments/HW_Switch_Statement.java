package Assignments;

import java.util.Scanner;

public class HW_Switch_Statement {

	public static void main(String[] args) {
		// Program to perform arithmetic operations:-
    //Q- Take a input from user, input1, input2 as int and ask the user what you want to do,
    //   enter char +,*,/,%,-, you will share the result by using the switch
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		int input1 = sc.nextInt();
		System.out.println("Enter num2");
		int input2 = sc.nextInt();
		System.out.println("Enter Operations +,-,%,/,*");
		char operator = sc.next().charAt(0);
		
		switch(operator) {
		case '+':
			System.out.println("Result: " + (input1 + input2));
			break;
		case '-':
			System.out.println("Result: " + (input1 - input2));
			break;
		case '*':
			System.out.println("Result: " + (input1 * input2));
			break;
		case '%':
			System.out.println("Result: " + (input1 % input2));
			break;
		case '/':
			System.out.println("Result: " + (input1 / input2));
			break;
		default:
			System.out.println("Invalid Operator");
		}
		sc.close();
	}
}