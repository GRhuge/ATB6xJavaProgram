package ex_1Jun2024_Collection_Framework_set;

import java.util.HashSet;
import java.util.Set;

public class Lab193 {

	public static void main(String[] args) {
		Set<String> fruits = new HashSet();
		fruits.add("Pineapple");
		fruits.add("orange");
		fruits.add("mango");
		fruits.add("banana");
		fruits.add("Pineapple");
		System.out.println(fruits);
		System.out.println(fruits.size());
		System.out.println(fruits.isEmpty());
		System.out.println(fruits.contains("orange"));
		System.out.println(fruits.remove("Pineapple"));
		System.out.println(fruits);
	}

}
