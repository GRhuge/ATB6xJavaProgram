package ex_25Apr2024_SwitchStatements;

public class Lab088 {

	public static void main(String[] args) {
		char code = 'A';
		int val = switch (code)
				{
		case 'A':
			yield 65;
		case 'B':
			yield 66;
			default:
				System.out.println("DD");
				throw new IllegalStateException("Error");	
				};

	}

}
