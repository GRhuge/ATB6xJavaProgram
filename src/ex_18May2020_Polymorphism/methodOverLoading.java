package ex_18May2020_Polymorphism;

public class methodOverLoading {
	void gift(String s) {
		System.out.println("s is a string" + s);
	}
	void gift(int a) {
		System.out.println("A is a int " + a);
	}
	float gift(float f) {
		System.out.println("f is a string" + f);
		return f;
	}
	void gift() {
		System.out.println();
	}
	public static void main(String[] args) {
		methodOverLoading p = new methodOverLoading();
		p.gift(2);
	}
}
