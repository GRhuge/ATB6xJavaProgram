package ex_11May2024;

public class Course_Class_Execution {

	public static void main(String[] args) {
		Course name = new Course();
		name.course_name = "core java";
		System.out.println("The course name is -> " + name.course_name);
		
		Course fees = new Course();
		fees.course_fees = 9000;
		System.out.println("The course fee is -> " +fees.course_fees);
	}

}
