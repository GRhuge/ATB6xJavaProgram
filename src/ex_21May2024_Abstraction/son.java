package ex_21May2024_Abstraction;

public class son extends father {
	void loan50k() {
		System.out.println("son is paying 50k loan");
	}
public static void main(String[] args) {
	son s = new son();
	s.loan50k();
	}
}
