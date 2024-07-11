package ex_28May_CollectionFramework;

import java.util.ArrayList;

public class Lab176 {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(200);
		al.add("ssd");
		al.add(400);
		al.add(900);
		al.add("ssd");
		al.add("ssd");
		System.out.println(al);
		
		al.remove("ssd");
		al.remove(1);
		System.out.println(al);
	}

}
