package ex_28May_CollectionFramework;

import java.util.Collections;
import java.util.Vector;

public class Lab189 {

	public static void main(String[] args) {
		Vector b = new Vector();
		b.add(12);
		b.add(5);
		b.add(8);
		
		Collections.sort(b);
		System.out.println(b);
	}

}
