package Hierarchical_Inheritance;

public class sita extends Father {
	void h() {
		house();
	}
	public static void main(String[] args) {
		sita s = new sita();
		s.house();
		krsna k = new krsna();
		k.house();
	}	
}