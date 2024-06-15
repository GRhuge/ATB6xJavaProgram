package ex_4May2024_ArraysPart2;

public class Lab133_ForEach_Loop {

	public static void main(String[] args) {
		int[] arr = {23,55,76};
		
		for(int num : arr) { // for each loop
			System.out.println(num);
		}
		System.out.println("------");
		for(int i = 0; i < arr.length; i++) { // for loop 
			System.out.println(arr[i]);
		}
	}

}
