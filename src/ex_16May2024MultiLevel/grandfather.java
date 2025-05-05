package ex_16May2024MultiLevel;

public class grandfather {
	public void home() {
		System.out.println("1bhk");
	}
}
	 class father extends grandfather{
		public void home() {
			System.out.println("2bhk");
		}
	}
	class child extends father{
		public void home() {
			System.out.println("3bhk");
		}
	public static void main(String[] args) {
		child c = new child();
		c.home();
	}
}