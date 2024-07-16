package ex_1Jun2024_Collection_Framework_set;

import java.util.PriorityQueue;
import java.util.Queue;

public class Lab199 {

	public static void main(String[] args) {
		Queue q = new PriorityQueue();
		q.add("a");
		q.add("s");
		q.add("q");
		q.add("b");
		q.add("a");
		System.out.println(q);
	}

}
