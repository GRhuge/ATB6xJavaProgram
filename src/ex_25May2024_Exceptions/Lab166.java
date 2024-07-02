package ex_25May2024_Exceptions;

public class Lab166 {

	public static void main(String[] args) {
		String s = args[0]; //from Run Configuration we have passed 5 as an argument
		int x = Integer.parseInt(s); // parseInt will convert String="5"; to int = 5;
		int a = 10/x;
		System.out.println(x);
		System.out.println(a);
		
		// Test case for program
		// No Input in run configuration argument - ArrayIndexOutOfBoundException
		// 0 Input as an argument in run configuration - ArithmeticException
		// "krsna" as an argument in run configuration - NumberFormatException
		// Special characters like(!@#$%) as an argument in run configuration - NumberFormatException
	}
}
