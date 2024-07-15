package ex_28May_CollectionFramework;

import java.util.Stack;

public class Lab190_Stack {

	public static void main(String[] args) {
		Stack s = new Stack();
		s.push("hari");
		s.push("krsna");
		s.push(200);
		
		System.out.println(s);
		System.out.println(s.pop());
		System.out.println(s);
		System.out.println(s.peek());
		System.out.println(s.search("krsna"));
	}

}
