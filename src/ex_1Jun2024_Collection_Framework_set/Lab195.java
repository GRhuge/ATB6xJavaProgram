package ex_1Jun2024_Collection_Framework_set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Lab195 {

	public static void main(String[] args) {
		Set courseSet = new LinkedHashSet();
		courseSet.add("atb");
		courseSet.add("mtb");
		courseSet.add("java");
		courseSet.add("api");
		System.out.println(courseSet); 
	}

}
