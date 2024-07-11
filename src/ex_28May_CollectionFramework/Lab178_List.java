package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab178_List {

	public static void main(String[] args) {
		List<Integer> l = new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(10);
		l.add(null);
		System.out.println(l);
		
		Iterator itr=l.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---");
		
		ListIterator<Integer> ite=l.listIterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
	}

}
