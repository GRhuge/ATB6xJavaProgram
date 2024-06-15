package Assignments;

public class Lab129_DoubleTheSalary_UsingArrays {

	public static void main(String[] args) {
		int[] a = {1,2,3};
		int[] a1 = new int[3];
		
		for(int i = 0; i < a.length; i++) {
			a1[i] = a[i]*2;
		}
		System.out.println("Printing Arrays");
		for(int i = 0; i < a1.length; i++) {
			System.out.println(a1[i]);
		}
	}

}
