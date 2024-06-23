package ex_16May2024MultiLevel;

public class Lab145 {

	public static void main(String[] args) {
	//	grandfather g = new grandfather();
	//	g.home();
		
	//	father f = new father();
	//	f.home();
		
	//	child c = new child();
	//	c.home();
		
		// Dynamic Dispatch
		grandfather gf = new child();
		gf.home();
		
		grandfather g1 = new father();
		g1.home();
	}

}
