package ex_25May2024_WrapperClasses;

public class Lab156 {

	public static void main(String[] args) {
		int x = 123;
		String s = String.valueOf(x);
		
		// Auto-Unboxing example in Wrapper class
		Character ch = 'a';
		char n = ch; // Wrapper to primitive - Unboxing - Automatically
		Boolean b = true;
		Float f = 12.4f;
		Double d = 13.1d;
		Long l = 234l;
		
		Integer intObject = Integer.valueOf(1);
		System.out.println(intObject);
	}

}
