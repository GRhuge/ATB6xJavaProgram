package ex_18May2024Super_Keyword;

class person{
	void message() {
		System.out.println("I am person msg");
	}
}
class student extends person{
	void message() {
		System.out.println("I am student msg");
	}
	void display() {
		super.message();
	}
}
public class Lab148 {

	public static void main(String[] args) {
		student s = new student();
		s.display();
	}

}
