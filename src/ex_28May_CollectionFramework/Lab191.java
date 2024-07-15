package ex_28May_CollectionFramework;

import java.util.Stack;

public class Lab191 {

	public static void main(String[] args) {
		Stack p = new Stack();
		p.push("A");
		p.push("B");
		p.push("C");
		p.push("D");
		
		System.out.println(p);
		System.out.println(p.pop());
		System.out.println(p);
	}

}
