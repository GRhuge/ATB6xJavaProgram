package ex_1Jun2024_Collection_Framework_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Lab194 {

	public static void main(String[] args) {
		Set courseSet = new HashSet();
		courseSet.add("atb");
		courseSet.add("mtb");
		courseSet.add("java");
		courseSet.add("api");
		System.out.println(courseSet);
		
		for(Object o : courseSet) {
			System.out.println(o);
		}
		
		Iterator i = courseSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}
