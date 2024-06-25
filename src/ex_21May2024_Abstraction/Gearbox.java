package ex_21May2024_Abstraction;

abstract class Gearbox {
	abstract void partGearBox();
	
	public static void main(String[] args) {
		Car lambo = new Car();
		lambo.start();
		lambo.stop();
		lambo.partGearBox();
	}
}
