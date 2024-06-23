package ex_18May2024Super_Keyword;

public class super_for_Constructor {

	public static void main(String[] args) {
		student1 s = new student1();
	}
}
class person1{
	person1(){
		System.out.println("person1 - DC");
	}
	
}
class student1 extends person1{
	student1(){
		super();
		System.out.println("student1 - DC");
	}
}
