package ex_23Apr2024_Conditional_Statements_IFelse;
import java.util.Scanner;

public class Lab078InterviewQuestion {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the side1, side2, side3, I will tell about the triangle");
		int side1 = sc.nextInt();
		int side2 = sc.nextInt();
		int side3 = sc.nextInt();
		
		if((side1 == side2) && (side1 == side3) && (side2 == side3))
		{
			System.out.println("Equilateral Triangle");
		}
		else if((side1 == side2) || (side1 == side3) || (side2 == side3))
		{
			System.out.println("ISO"); 
		}
		else
		{
			System.out.println("Scalene");
		}
	}

}
