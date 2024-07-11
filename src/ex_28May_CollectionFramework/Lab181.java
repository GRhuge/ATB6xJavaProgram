package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Lab181 {

	public static void main(String[] args) {
		List a = new ArrayList();
		a.add(10);
		a.add("deepak");
		a.add("hub");
		
		ListIterator it = a.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("---");
		
		while(it.hasPrevious()) {
			System.out.println(it.previous());
		}
	}

}
