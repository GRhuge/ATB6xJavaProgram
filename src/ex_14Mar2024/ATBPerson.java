package ex_14Mar2024;

public class ATBPerson {
	String name;
	long phone;
	String email;
	boolean isMarried;
	String courseName;
	
	// Default Constructor
	 ATBPerson(){
		System.out.println("Default Constructor");
	}
	 // Parameterized Constructor
	 ATBPerson(String givenName, long number){
		 System.out.println("Parameterized Constructor");
		 this.name = givenName;
		 this.phone = number;
	//	 this.email = EmId;
	//	 this.isMarried = turu;
	//	 this.courseName = CName;
	 }
	 ATBPerson(String givenName){
		 name = givenName;
	 }
	public static void main(String[] args) {
		ATBPerson obj = new ATBPerson(); // Default Const
		ATBPerson obj2 = new ATBPerson("Krsna", 789654130); // Parameterized Const
		System.out.println(obj2.name); // Parameterized Const
		System.out.println(obj2.phone); // Parameterized Const
		ATBPerson obj3 = new ATBPerson("Hari", 456789123); // Parameterized Const
		System.out.println(obj3.name); // Parameterized Const
		System.out.println(obj3.phone); // Parameterized Const
	}
	
}
