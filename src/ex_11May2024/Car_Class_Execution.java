package ex_11May2024;

public class Car_Class_Execution {

	public static void main(String[] args) {
		Car tesla = new Car();
		tesla.name = "Tesla";
		tesla.model = "Model 3";
		// below are methods
		tesla.reverse();
		tesla.Topspeed();
		
		Car volvo = new Car();
		volvo.name = "volvo";
		volvo.model = "XC90";
		// below are methods
		volvo.reverse();
		volvo.Topspeed();
	}

}
