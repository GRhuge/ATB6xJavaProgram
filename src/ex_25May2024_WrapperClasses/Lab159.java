package ex_25May2024_WrapperClasses;

public class Lab159 {

	public static void main(String[] args) {
		// Auto-boxing example in Wrapper class
		int a = 100;
		Integer b=a;
		System.out.println("Autoboxing"+ b); 
		
		// Normal boxing example in Wrapper class
		int x = 20;
		Integer y = Integer.valueOf(x);
		System.out.println("Boxing"+ y);
		
		// Unboxing example in Wrapper class
		Integer result = 200;
		int Newresult= result.intValue();
		System.out.println("Unboxing"+ Newresult);
		
		// Auto-Unboxing example in Wrapper class
		Integer marks = 78;
		int Newmarks = marks;
		System.out.println("Auto-Unboxing"+ Newmarks);
	}

}
