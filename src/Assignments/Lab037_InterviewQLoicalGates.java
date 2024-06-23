package Assignments;

public class Lab037_InterviewQLoicalGates {

	public static void main(String[] args) {
		
		int a = 12;
		boolean b = !(a > 10 || a < 5);
		            // (true || false) --> output is --> true
		   // !(true || false) because of Not Gate (!) at the beginning of the bracket the final output will turn into "false" 
		System.out.println(b);

	}

}
