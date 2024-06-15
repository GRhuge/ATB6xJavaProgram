package ex_2May2024_Arrays;

public class Lab120 {

	public static void main(String[] args) {
		// == -> Ref
		// .equals -> values / contents
		
		int[] arr1 = {1,2,3,4,5};
		int[] arr2 = {1,2,3,4,5};
		System.out.println(arr1==arr2);
		
		System.out.println(arr1);
		System.out.println(arr2);
		
		int[] arr3 = arr1;
		System.out.println(arr1==arr3);
		
		System.out.println(arr1.equals(arr2)); // it checks for reference
		
		String a = "Krsna";
		String b = "Krsna";
		System.out.println(a.equals(b)); // String checks for contents
	}

}
