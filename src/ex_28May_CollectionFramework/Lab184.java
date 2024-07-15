package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab184 {

	public static void main(String[] args) {
		List ttacourseList = new ArrayList();
		ttacourseList.add("atb");
		ttacourseList.add("mtb");
		ttacourseList.add("java");
		ttacourseList.add(11);
		ttacourseList.add(true);
		
		Iterator its = ttacourseList.iterator();
		while(its.hasNext()) {
			System.out.println(its.next());
		}
		
		System.out.println("---");
		
		for(Object o : ttacourseList) {
			System.out.println(o);
		}
		
		System.out.println("---");
		
		ListIterator it = ttacourseList.listIterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("--1-");
		
	//	ListIterator i = ttacourseList.listIterator(ttacourseList.size());
		while(it.hasPrevious()) {
			it.add("hari");
		//	System.out.println(it.hasPrevious());
		}
	}

}
