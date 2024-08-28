package ex_25Apr2024_SwitchStatements;

public class Lab086 {

	public static void main(String[] args) {
		// Another feature in JDK above 13 
		
		int itemcode = 001;
		
		switch(itemcode)
		{
		case 001 -> System.out.println("It is a laptop");
		case 002 -> System.out.println("It is a mobile");
		case 003, 004 -> System.out.println("It is a desktop");
		default -> System.out.println("Krsna");
		}
		char ch = 'a';
		switch(ch)
		{
		case 'a', 'e', 'i', 'o', 'u' -> System.out.println("Vowel");
		default -> System.out.println("Consonant");
		}

	}

}
