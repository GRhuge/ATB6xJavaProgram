package ex_7May2024;

public class Lab138 {
	static void sayHi() {
		System.out.println("Hello Hi");
	}
	static void sayBye() {
		System.out.println("Hello Bye");
	}
	public static void main(String[] args) {
		for(int i = 0; i < 100; i++) {
			sayHi();
			sayBye();
		}
	}

}
