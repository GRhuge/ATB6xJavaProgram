package ex_7May2024;

public class Lab142 {
	static void saysomethingPlease() {
		System.out.println("non return with no parameter");
	}
	static void saybye(String s) {
		System.out.println("Hare " + s);
	}
	static void sumoftwo(int a , int b) {
		System.out.println(a+b);;
	}
	static int sumofnumber(int a, int b) {
		return a+b;
	}
	public static void main(String[] args) {
  		// Non return type with no parameter
		saysomethingPlease();
		
		// non type return with parameter
		saybye("krsna");
		
		// Return type with no parameter
		sumoftwo(7 , 5);
		
		// Return type with parameter
		int result = sumofnumber(3 , 6);
		System.out.println(result);
		
		
	}
	
}
