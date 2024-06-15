package ex_7May2024;

public class Lab140 {
	static int sumoftwo(int a , int b) {
		return a+b;
	}
	static String sumoftwo(String a , int b) {
		return a+b;
	}
	
	
	public static void main(String[] args) {
		int r1 = sumoftwo(4, 3);
		System.out.println(r1);
		
		int r2 = sumoftwo(7 , 9);
		System.out.println(r2);
		
		String r3 = sumoftwo("krsna", 3);
		System.out.println(r3);
	}

}
