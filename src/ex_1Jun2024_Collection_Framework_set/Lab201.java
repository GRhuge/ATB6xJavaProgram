package ex_1Jun2024_Collection_Framework_set;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.WeakHashMap;

public class Lab201 {

	public static void main(String[] args) {
	//	Map m = new WeakHashMap();
	//	Map m = new TreeMap();
	//	Map m = new LinkedHashMap();
		Map m = new HashMap();
		m.put("id",1);
		m.put("id2",2);
		m.put("id3",34);
		System.out.println(m.keySet());
		System.out.println(m.values());
	}

}
