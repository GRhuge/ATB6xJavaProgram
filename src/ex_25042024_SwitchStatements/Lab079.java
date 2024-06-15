package ex_25042024_SwitchStatements;
import java.util.Scanner;
public class Lab079 {

	public static void main(String[] args) {
		// Switch - Multiple Condition
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number 1-7, I will tell you which day it is");
		int day = sc.nextInt();
		
		switch(day)
		{
		case 1:
			System.out.println("Mon");
			break;
		case 2:
			System.out.println("Tue");
			break;
		case 3:
			System.out.println("Wed");
			break;
		case 4:
			System.out.println("Thu");
			break;
		case 5:
			System.out.println("Fri");
			break;
		case 6:
			System.out.println("Sat");
			break;
		case 7:
			System.out.println("Sun");
			break;
		default:
			System.out.println("only 1-7 are allowed");
		}
	}

}
