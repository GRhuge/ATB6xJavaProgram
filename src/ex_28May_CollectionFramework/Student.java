package ex_28May_CollectionFramework;

import java.util.Comparator;

class SortByIdAsc implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o1.getid(), o2.getid());
	}
}

class SortByIdDes implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return Integer.compare(o2.getid(), o1.getid());
	}
}

class SortByName implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		return o1.getName().compareTo(o2.getName());
	}

}

public class Student implements Comparable<Student> {
	private Integer id;
	private String name;

	public Student(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	Integer getid() {
		return id;
	}

	void setid(Integer id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

//	@Override
//	public int compareTo(Student o) {
//		return Integer.compare(this.id, o.id); Here we can compare only one element at a time
//	}                                          And to compare integer function we use Integer.compare
	// And to compare String function we use CharSeq
	@Override
	public int compareTo(Student o) {
		return CharSequence.compare(this.name, o.name);
	}
}
