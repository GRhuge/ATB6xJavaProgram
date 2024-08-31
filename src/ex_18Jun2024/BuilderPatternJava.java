package ex_18Jun2024;

public class BuilderPatternJava {
	
	public BuilderPatternJava groundFloor() {
		System.out.println("do some task of ground floor");
		return this;
	}
	
	public BuilderPatternJava firstFloor(String name) {
		System.out.println("do some task of ground floor"+name);
		return this;
	}
	
	public BuilderPatternJava secondFloor(String name,String color) {
		System.out.println("do some task of ground floor"+name+color);
		return this;
	}
	
	public static void main(String[] args) {
		BuilderPatternJava bp = new BuilderPatternJava();
		bp.groundFloor().firstFloor("krsna").secondFloor("ram", "green");
	}

}
