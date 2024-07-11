package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class Lab182 {

	public static void main(String[] args) {
		List url_pages = new ArrayList();
		url_pages.add("Loginpage");
		url_pages.add("Dashpage");
		url_pages.add("homepage");
		System.out.println(url_pages);
		
		for(int i = 0; i < url_pages.size(); i++) {
			System.out.println(url_pages.get(i));
		}
		
		System.out.println("---");
		
		for(Object s : url_pages) {
			System.out.println(s);
		}
	}

}
