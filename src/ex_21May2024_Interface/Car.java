package ex_21May2024_Interface;

public class Car implements Brake, Engine{
	public void applyBrake() {
		System.out.println("Apply brake");
	}
	
	public void startEngine() {
		System.out.println("start engine");
	}
	
    public void stopEngine() {
    	System.out.println("stop engine");
	}
}
