package ex_23Apr2024_Conditional_Statements_IFelse;
import java.util.Scanner;
public class Lab075 {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		if(number > 20)
		{
			System.out.println("num > 20");
		}
		else if(number > 10)
		{
			System.out.println("num is between 10 and 20");
		}
		else
		{
			System.out.println("Num is < 20");
		}
		}

}
