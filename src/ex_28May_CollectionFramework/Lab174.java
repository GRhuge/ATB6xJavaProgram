package ex_28May_CollectionFramework;

import java.util.List;

public class Lab174 {

	public static void main(String[] args) {
		List shopping_list = List.of("milk", "bread", "butter");
		System.out.println(shopping_list);
		System.out.println(shopping_list.size());
		System.out.println(shopping_list.get(0));
		System.out.println(shopping_list.indexOf("bread"));
		System.out.println(shopping_list.isEmpty());
		shopping_list.add("cheese");
		System.out.println(shopping_list);
	}
}
