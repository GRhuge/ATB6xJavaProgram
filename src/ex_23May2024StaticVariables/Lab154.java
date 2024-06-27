package ex_23May2024StaticVariables;

public class Lab154 {

	public static void main(String[] args) {
		Person p = new Person("Amit");
		Person p1 = new Person("ross");
		System.out.println(Person.footBallClub);
		Person.m1(); // To call static method type(Class name DOT(.) method i.e. Person.m1())
		p.m1(); // To call non-static method type(Class Reference and method i.e. p1.m1())
		p1.m2(); 
	}
}
class Person{
	
static String footBallClub = "Arsenal"; // "static" keyword is used because it is common for every object

	{
		System.out.println("IIB");
	}
	static void m1() {
		System.out.println("I am common fun");
	}
	void m2() {
		System.out.println("Person -> " + this.name);
	}
	String name;
	Person(String name){
		this.name = name;
	}
}