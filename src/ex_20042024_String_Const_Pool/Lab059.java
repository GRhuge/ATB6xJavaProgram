package ex_20042024_String_Const_Pool;

public class Lab059 {

	public static void main(String[] args) {
		String name = "The Krsna Academy";
		String name1 = "The Krsna Academy";
		String name2 = new String ("The Krsna Academy");
		
		System.out.println(name == name1); // Check the reference
		System.out.println(name.equals(name1)); // Check the values/content
		
		System.out.println(name == name2);
		System.out.println(name.equals(name2));
	}

}
