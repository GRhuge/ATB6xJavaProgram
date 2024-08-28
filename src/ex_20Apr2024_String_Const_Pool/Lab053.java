package ex_20Apr2024_String_Const_Pool;

public class Lab053 {

	public static void main(String[] args) {
		String name = "Krsna"; // <-- This is Assignment operator
		String name1 = new String(); // <-- New operator
		
		System.out.println("Your name is --> " +name);
		System.out.printf("Your name is --> %s", name);
		
		System.out.println("\n -- All the functions available in String -- ");
		System.out.println(name.length());
		System.out.println(name.toLowerCase());
		System.out.println(name.toUpperCase());
		
		int age = 65;
		// Primitive data Types --> Byte, int, long, short, double, float, char, boolean
		// All primitive data types don't have any extra functionality
		
		// Non-primitive data Type
		// String --> Has extra functionalities
	}

}
