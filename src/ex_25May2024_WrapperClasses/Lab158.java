package ex_25May2024_WrapperClasses;

public class Lab158 {

	public static void main(String[] args) {
		String price1 = "463.11";
		String price2 = "237.23";
		
		double p1=Double.parseDouble(price1);
		double p2=Double.parseDouble(price2);
		
		System.out.println(p1);
		System.out.println(p2);
		double sum = p1+p2;
		
		if(sum == 700.33) {
			System.out.println("passed");
		}
		else {
			System.out.println("failed");
		}
	}

}
