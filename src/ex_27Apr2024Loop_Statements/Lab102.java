package ex_27Apr2024Loop_Statements;

public class Lab102 {

	public static void main(String[] args) {
		for(int i = 1; i <= 10; i++)
		{
		 // System.out.println("Val of"+i);
			if(i == 5)
			{
				break;
			}
			System.out.println("Val of" + i);
		}
		System.out.println("End");
	}
}
