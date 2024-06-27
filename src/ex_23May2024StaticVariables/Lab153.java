package ex_23May2024StaticVariables;

public class Lab153 {

	public static void main(String[] args) {
		ATB hari = new ATB("123456789");
		ATB ram = new ATB("789654123");
		
		hari.printDetails();
		ram.printDetails();
		
		System.out.println(ATB.courseName);
	}

}
class ATB {
	static String courseName = "ATB";
	String phoneNo;
	
	ATB(String phoneNo){
		this.phoneNo = phoneNo;
	}
	void printDetails() {
		System.out.println("Your Details" + this.phoneNo);
	}
}
