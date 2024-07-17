package Assignments;

import java.util.HashSet;
import java.util.Set;

public class Lab197_IntQ_GivenAnArrayOfInt_Return_Unique_Ele {

	public static void main(String[] args) {
		int[] input = {1,2,3,4,4,4,5,5,6};
		
		Set uniqueSet = new HashSet();
		for(Object num : input) {
			uniqueSet.add(num);
		}
		System.out.println(uniqueSet);
	}
}
