package ex_23Apr2024_Conditional_Statements_IFelse;
import java.util.Scanner;

public class Lab073 {

	public static void main(String[] args) {
		// Take input from a user by using scanner class
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number");
		int num = sc.nextInt();
		
		if(num%2 == 0)
		{
			System.out.println("Even");
		}
		else {
			System.out.println("Odd");
		}
		sc.close();
	}

}
