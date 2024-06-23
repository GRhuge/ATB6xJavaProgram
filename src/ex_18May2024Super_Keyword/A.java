package ex_18May2024Super_Keyword;

public class A{
	void m1() {
		System.out.println("A class method");
	}
}
class B extends A{
	void m1() {
		System.out.println("B class method");
	}
	void show() {
		super.m1();
		System.out.println("show method");
	}
	public static void main(String[] args) {
		B ob = new B();
		ob.show();
	}
}