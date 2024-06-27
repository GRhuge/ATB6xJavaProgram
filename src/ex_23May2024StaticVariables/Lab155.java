package ex_23May2024StaticVariables;

public class Lab155 {

	public static void main(String[] args) {
		A r = new A();
		A b = new A();
		System.out.println(A.c);
		System.out.println(r.c);
		
		A.m1();
		r.m1();
		b.m1();
	//	A.m2(); <- not possible
		r.m2(); // possible because we are taking Reference variable of class and calling method
	
	}
}
class A {
	int age = 10;
	static String c = "ACD";
	static {
		System.out.println("B");
	}
	{
		System.out.println("IIB");
	}
	static void m1() {
		System.out.println("m1");
	}
	void m2() {
		System.out.println("m2");
	}
}
