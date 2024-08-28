package ex_20Apr2024_String_Const_Pool;

public class Lab055 {

	public static void main(String[] args) {
		String s1 = "Krsna";
		String s2 = s1;
		System.out.println(s2);
		
		System.out.println(" ---- ");
		
		String s3 = "The Krsna Academy";
		s3 = s3.toLowerCase();
		System.out.println(s3.toLowerCase());
	}

}
