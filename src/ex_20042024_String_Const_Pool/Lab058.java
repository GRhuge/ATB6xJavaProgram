package ex_20042024_String_Const_Pool;

public class Lab058 {

	public static void main(String[] args) {
		String str1 = "Hello"; // Because of line 6,7,8, and 10 four(4) strings get created in SCP
		String str2 = "Guys";
		String str3 = "Hello Guys";
		
		String str4 = str1.concat(str2);

	}

}
