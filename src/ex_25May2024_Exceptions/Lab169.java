package ex_25May2024_Exceptions;

public class Lab169 {

	public static void main(String[] args) {
		try {
		String s = args[0]; //from Run Configuration we have passed 5 as an argument
		int x = Integer.parseInt(s); // parseInt will convert String="5"; to int = 5;
		int a = 10/x;
		System.out.println(x);
		System.out.println(a);
		}catch(Exception e) {
			System.out.println("Problem with the code");
		}
	}

}
