package ex_16May2024SingleInheritance;

public class Programming {
	int version;
	String aurthor;
	
	Programming(){
		System.out.println("Default Const");
	}
	Programming(int version, String aurthor){
		this.version = version;
		this.aurthor = aurthor;
	}
	void printInfo() {
		System.out.println("Program version is -> " + this.version + "Aurthor is -> " + this.aurthor);
	}
	void bhk3() {
		System.out.println("3bhk");
	}
}
