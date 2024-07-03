package ex_25May2024_Exceptions;

public class Lab173 {

	public static void main(String[] args) {
		try {
			int a =10/0;
		} catch (Exception e) {
			System.out.println("can't divide the no. by zero");
		}
	}

}
