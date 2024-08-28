package ex_20Apr2024_String_Const_Pool;

public class Lab064 {

	public static void main(String[] args) {
		String password = "Krsna@123";
		String pass_u = password.toLowerCase();
		System.out.println(pass_u);
		
		System.out.println(pass_u == password);
		System.out.println(pass_u.equals(password));
		System.out.println(pass_u.equalsIgnoreCase(password));
		
		System.out.println(password.substring(0,3));
		System.out.println(password.indexOf("K"));

	}

}
