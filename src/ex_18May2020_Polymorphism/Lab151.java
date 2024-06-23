package ex_18May2020_Polymorphism;

public class Lab151 {

	public static void main(String[] args) {
		Dog_methodOverriding d = new Dog_methodOverriding();
		d.bark();
		
		Hound h = new Hound();
		h.bark();
	}

}
