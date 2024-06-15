package ex_23042024_Conditional_Statements_IFelse;
import java.util.Scanner;

public class Lab074 {

	public static void main(String[] args) 
	{
		System.out.println("Enter num 1");
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		
		System.out.println("Enter num 2");
		int num1 = s.nextInt();
		int max = Math.max(num, num1);
		System.out.println("Max by Math.max fun()"+ max);		
		if(num > num1)
		{
			System.out.println("Max is -->"+num);
		}
		else
		{
			System.out.println("Min is -->"+num1);
		}
		s.close();
	}

}
