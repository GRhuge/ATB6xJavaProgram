package ex_1Jun2024_Collection_Framework_set;

import java.util.HashMap;
import java.util.Map;

public class Lab198 {

	public static void main(String[] args) {
		Map m = new HashMap();	
		m.put(101, "Deepak");
		m.put(102, "amit");
		m.put(103, "ram");
		System.out.println(m.containsKey(104));
		System.out.println(m.containsValue("Deepak"));
		System.out.println(m.get(101));
	//	m.remove(102);
		m.replace(101, "krsna");
		System.out.println(m);
	}
} 
