package ex_1Jun2024_Collection_Framework_set;

import java.util.Enumeration;
import java.util.Hashtable;

public class Lab202 {

	public static void main(String[] args) {
		Hashtable<Integer, String> s = new Hashtable();
		s.put(1, "one");
		s.put(2, "two");
		s.put(3, "three");
		
		Enumeration<Integer> e = s.keys();
		while(e.hasMoreElements()) {
			Integer key = e.nextElement();
			System.out.println(key + " : " + s.get(key));
			
		}
	}

}
