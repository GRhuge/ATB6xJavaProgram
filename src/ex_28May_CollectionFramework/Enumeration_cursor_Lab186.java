package ex_28May_CollectionFramework;

import java.util.Enumeration;
import java.util.List;
import java.util.Vector;

public class Enumeration_cursor_Lab186 {

	public static void main(String[] args) {
		Vector v = new Vector();
		v.add(10);
		v.add("ross");
		v.add("sri");
		
		Enumeration e = v.elements();
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
	}

}
