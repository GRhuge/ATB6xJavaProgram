package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab183 {

	public static void main(String[] args) {
		List<String> courselist = new ArrayList();
		courselist.add("atb");
		courselist.add("mtb");
		courselist.add("Pyatb");
		courselist.add("Lapib");
		
		List numlist = new ArrayList();
		numlist.add(150);
		numlist.add(100);
		numlist.add(200);
		numlist.add(400);
		
		courselist.addAll(numlist);
		System.out.println(courselist);
	}

}
