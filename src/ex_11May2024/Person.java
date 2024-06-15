package ex_11May2024;

public class Person {
	    // from line 5 to 13 this are attributes or instance variable
		String name;
		byte age;
		long phone;
		String[] address;
		double height;
		boolean male;
		float salary;
		String dob;
		String eye_color;
		
		// Below are the Methods from line 15 to 27
		void walk() {
			System.out.println("I can walk");
		}
		void talk(String msg) {
			System.out.println("I will talk" + msg);
		}
		String sleep() {
			return "Sleeping";
		}
		String eat(String item) {
			return item;
		}
}
