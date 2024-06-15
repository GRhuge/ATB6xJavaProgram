package ex_4May2024_ArraysPart2;

public class Lab129_DoubleTheSalary_UsingArrays {

	public static void main(String[] args) {
		int[] array = {1,2,3};
		int[] array1 = new int[3];
		
		for(int i = 0; i < array.length; i++) {
			array1[i] = array[i]*2;
		}
		System.out.println("Printing Arrays");
		for(int i = 0; i < array1.length; i++) {
			System.out.println(array1[i]);
		}
	}

}
