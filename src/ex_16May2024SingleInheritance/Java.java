package ex_16May2024SingleInheritance;

public class Java extends Programming{
	String newfeature;
	
	Java(){
		System.out.println("Default Const");
	}
	
	Java(String newfeature){
		this.newfeature = newfeature;
	}
	void printInfo() {
		System.out.println("Feature is -> " + this.newfeature);
		bhk3();
	}
	
	public static void main(String[] args) {
		Programming p = new Programming(12, "Kai chi");
		p.printInfo();
		Java j = new Java("Lambda exp");
		j.printInfo();
		
		Programming p1 = new Programming (11, "Van Russom");
		p1.printInfo();
		
		Python p2 = new Python();
		p2.printInfo();
	}
}
