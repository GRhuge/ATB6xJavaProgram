package ex_18May2024Super_Keyword;

public class Lab147 {

	public static void main(String[] args) {
		car c = new car();
		c.display();
	}
}

class vehicle{
	int maxSpeed = 180;
	void msg() {
		System.out.println("This is vehicle Class");
	}
}
class car extends vehicle{
    int maxSpeed = 100;
	void display() {
		System.out.println("Max speed of vehicle is " + super.maxSpeed); // it refers to parent class instance variable
		System.out.println("Max speed of car is " +  this.maxSpeed); // it refers to child class instance variable
	}
}