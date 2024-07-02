package ex_25May2024_Exceptions;

public class Lab168_Unchecked_Exception {

	public static void main(String[] args) {
		try {
		int a=100 , b=0, c;
		c=a/b;
		}
		catch(Exception e) {
			System.out.println("can't divide the number by zero");
		}
	}

}
