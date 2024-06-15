package ex_20042024_String_Const_Pool;

public class Lab061 {

	public static void main(String[] args) {
		String s1 = "Pramod";
		char c = s1.charAt(2);
		boolean result =s1.contains("a");
		System.out.println(c);
		
		s1=s1.concat(" dutta");
		System.out.println(s1);

	}

}
