package ex_18Jun2024;

public class NoDesignPattern {
	public void step1() {
		System.out.println("step 1");
	}
	public void step2() {
		System.out.println("step 2");
	}
	public void step3() {
		System.out.println("step 3");
	}
	public static void main(String[] args) {
		NoDesignPattern nod = new NoDesignPattern();
		nod.step1();
		nod.step2();
		nod.step3();
	}

}
