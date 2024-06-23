package ex_18May2024Super_Keyword;

public class Lab149 {

	public static void main(String[] args) {
		Dog d = new Dog();
		Dog d1 = new Dog("Labrador");
		Dog d2 = new Dog("Pitbull","Dog");
		d1.display();
	}
}
class Animal{
	String type;
	Animal(){
		System.out.println("Animal DC");
	}
	Animal(String type){
		this.type=type;
		System.out.println("Animal PC");
	}
}
class Dog extends Animal{
	String breed;
	Dog(){
		System.out.println("Dog DC");
	}
	Dog(String breed){
		super("Dog");
		this.breed=breed;
	}
	Dog(String breed, String type){
		this(breed);
		this.type=type;
		System.out.println("PC with two Arg");
	}
	void display() {
		System.out.println("Type: "+type +" Breed: " +breed);
	}
}