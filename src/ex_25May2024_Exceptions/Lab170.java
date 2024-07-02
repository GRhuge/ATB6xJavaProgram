package ex_25May2024_Exceptions;

public class Lab170 {

	public static void main(String[] args) {
		try {
		String s = "krsna";
		String s1 = args[0];
		int a = 10/0;
		s=null;
		System.out.println(s.trim());
		}catch(Exception e) {
			System.out.println("s is null");
		}
		finally {
			System.out.println("final is executed");
		}
	}

}
