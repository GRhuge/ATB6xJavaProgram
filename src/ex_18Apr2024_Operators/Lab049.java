package ex_18Apr2024_Operators;

public class Lab049 {

	public static void main(String[] args) {
		int a = 10;
		System.out.println(++a + a++ + a++);
		// Part --> A --> ++a , Exp = 11, a = 11
		// Part --> B --> a++ , Exp = 11, a = 12
		// Part --> C --> a++ , Exp = 12, a = 13

	}

}
