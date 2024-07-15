 package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lab180 {

	public static void main(String[] args) {
		{
			List<String> mylist = new ArrayList();
			mylist.add("aa");
			mylist.add("krsna");
			mylist.add("mi");
			
			for(String str : mylist) {
				System.out.println(str);
			}
			
			System.out.println("---");
			
			for(int i = 0; i < mylist.size(); i++) {
				System.out.println(mylist.get(i));
			}
			
			System.out.println("---");
			
			Iterator<String> itr = mylist.iterator();
			while(itr.hasNext()) {
				System.out.println(itr.next());
			}
	}
  }
}
