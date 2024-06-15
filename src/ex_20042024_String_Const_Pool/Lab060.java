package ex_20042024_String_Const_Pool;

public class Lab060 {

	public static void main(String[] args) {
		String s1 = new String("krsna");
		String s2 = new String("krsna");
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
	}

}
