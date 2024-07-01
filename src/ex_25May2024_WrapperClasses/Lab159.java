package ex_25May2024_WrapperClasses;

public class Lab159 {

	public static void main(String[] args) {
		// Auto-boxing example in Wrapper class
		int a = 100;
		Integer b=a; //Primitive to wrapper - boxing - Automatically
		System.out.println("Autoboxing"+ b); 
		
		// Manual boxing example in Wrapper class
		int x = 20;
		Integer y = Integer.valueOf(x); // Primitive to wrapper - boxing - Manually
		System.out.println("Boxing"+ y);
		
		// Unboxing example in Wrapper class
		Integer result = 200;
		int Newresult= result.intValue(); // Wrapper to primitive - Unboxing - Manually
		System.out.println("Unboxing"+ Newresult);
		
		// Auto-Unboxing example in Wrapper class
		Integer marks = 78; // Wrapper to primitive - Unboxing - Automatically
		int Newmarks = marks;
		System.out.println("Auto-Unboxing"+ Newmarks);
	}

}
