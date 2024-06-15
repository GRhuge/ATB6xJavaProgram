package ex_25042024_SwitchStatements;
import java.util.Scanner;
public class Lab081 {

	public static void main(String[] args) {
		// Take a user input as a Char and tell the user if it is vowel
		// A,E,I,O,U
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a char, I will tell you if it is a vowel or not");
		char user_input = sc.next().charAt(0);
		System.out.println(user_input);
		
		switch(user_input)
		{
		case 'a':
			System.out.println("Vowel");
			break;
		case 'e':
			System.out.println("Vowel");
			break;
		case 'i':
			System.out.println("Vowel");
			break;
		case 'o':
			System.out.println("Vowel");
			break;
		case 'u':
			System.out.println("Vowel");
			break;
		default:
			System.out.println("Not a vowel, It is constant1");
		}
		sc.close();
	}

}
	