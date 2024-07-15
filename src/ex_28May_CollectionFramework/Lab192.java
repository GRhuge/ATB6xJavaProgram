package ex_28May_CollectionFramework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Lab192 {

	public static void main(String[] args) {
		Student s1 = new Student(1, "krsna");
		Student s2 = new Student(22, "hari");
		Student s3 = new Student(3, "ram");

		List<Student> stud = new ArrayList();
		stud.add(s1);
		stud.add(s2);
		stud.add(s3);
		System.out.println(stud);
		Collections.sort(stud,new SortByName());
		System.out.println(stud);
	}

}
