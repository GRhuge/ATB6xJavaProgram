package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab188 {

	public static void main(String[] args) {
		List<Integer> myMarks = new ArrayList();
		myMarks.add(11);
		myMarks.add(3);
		myMarks.add(2);
		myMarks.add(1);
		
		Collections.sort(myMarks);
		System.out.println(myMarks);
	}

}
