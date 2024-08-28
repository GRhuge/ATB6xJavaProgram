package ex_25Apr2024_SwitchStatements;

import java.util.Scanner;

public class Lab089InterviewQuestion {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value for x");
		double x = sc.nextDouble();
		System.out.println("Enter the value for y");
		double y = sc.nextDouble();
		System.out.println("Enter the value for z");
		double z = sc.nextDouble();
		
		double result;
		// 3/ x raise to the power 2 + y raise to the power 2 - |Z|
		// It is similar to:- A + b - C , A -> raise to the power 2, B -> raise to the power 2, C -> |z|
		// |Z| absolute (Z) means // -1 -> 1, -2 -> 2
		
		result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
		System.out.println(result);
		sc.close();
	}
}
