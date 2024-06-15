package ex_25042024_SwitchStatements;

import java.util.Scanner;

public class Lab090 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your name");
		String name = sc.nextLine();
		
		System.out.println("Enter your age");
		int age = sc.nextInt();
		
		System.out.println("Enter your salary");
		double salary = sc.nextDouble();
		
		System.out.println("Enter your name is "+ name);
		System.out.println("Enter your age is "+ age);
		System.out.println("Enter your salary is "+ salary);
		sc.close();
	}

}
