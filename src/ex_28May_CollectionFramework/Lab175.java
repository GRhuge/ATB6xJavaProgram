package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab175 {

	public static void main(String[] args) {
		List al = new ArrayList();
		al.add("ask");
		al.add("kkr");
		al.add("ask");
		al.add("hyd");
		al.add("kkr");
		System.out.println(al);
		System.out.println(al.size());
		
		al.remove("kkr");//Removes the first occurrences of the specified element from the list 
		System.out.println(al);
		al.clear(); // Will clear all the elements present in the List al
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		al.add("ask");
		al.add("kkr");
		al.add("ask");
		al.add("hyd");
		al.add("kkr");
		System.out.println(al);
		al.set(3, "hydaus");
		System.out.println(al);
		
		System.out.println("----");
		
		//for loop
		for(int i=0; i< al.size();i++) {
			System.out.println(al.get(i));
		}
		
		System.out.println("----");
		//for each loop
		for(Object ob : al) {
			System.out.println(ob);
		}
	}

}
