package ex_4May2024_ArraysPart2;

public class Lab128FindMaxSal_Array_InterviewQ {

	public static void main(String[] args) {
		// Find the max salary / number in arrays
		int[] salaries = {30,50,60,90,100,999,-1,-2};
		// How do we find the max sal in the array?
		
		int max_salary = Integer.MIN_VALUE;
		for(int i = 0; i < salaries.length; i++) {
			if(salaries[i] > max_salary) {
				max_salary = salaries[i];
			}
		}
		System.out.println("Max Sal -> " + max_salary);
	}

}
