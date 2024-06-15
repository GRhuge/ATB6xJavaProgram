package ex_4May2024_ArraysPart2;

public class Lab134StringBuffer {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("krsna");
		sb.append("hari");
		sb.reverse();
		System.out.println(sb);
		
		StringBuilder sf = new StringBuilder("Ghuge");
		sf.append("rahul");
		System.out.println(sf);
		
		// mutable that can be changed 
		StringBuilder password2 = new StringBuilder("lonar");
		password2.append("folks");
		System.out.println(password2);
	}

}
