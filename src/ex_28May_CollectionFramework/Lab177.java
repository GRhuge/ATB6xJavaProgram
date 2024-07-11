package ex_28May_CollectionFramework;

import java.util.ArrayList;

public class Lab177 {
	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(200);
		al.add(300);
		System.out.println(al);
		
		ArrayList al2 = new ArrayList();
		al2.add(400);
		al2.add(200);
		al2.add(500);
		System.out.println(al2);
		
		al.removeAll(al2); // firstly it will compare between al and al2 then it will remove the common elements from al 
		System.out.println(al);
		System.out.println(al2);
		
		al.clear();
		System.out.println(al );
	}

}
