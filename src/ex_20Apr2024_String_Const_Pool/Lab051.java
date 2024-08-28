package ex_20Apr2024_String_Const_Pool;

public class Lab051 {

	public static void main(String[] args) {
		int a = 87;
		int b = 91;
		String s1 = "KK";
		String s2 = "RR";
		System.out.println(s1+s2+a+b);
		System.out.println(s1+s2+(a+b));

	}

}
