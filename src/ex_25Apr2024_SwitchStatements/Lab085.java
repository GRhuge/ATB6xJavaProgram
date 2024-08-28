package ex_25Apr2024_SwitchStatements;

public class Lab085 {

	public static void main(String[] args) {
// Above JDK 13 version we can mention multiple cases in a single line, refer line no. 10 & 13
		int itemcode = 005;
		switch(itemcode)
		{
		case 001, 002, 003:
			System.out.println("It is a electronic gadget");
		    break;
		case 004, 005, 006:
			System.out.println("It is a mechanical gadget");
		    break;
		    default:
		    	System.out.println("None");
		}
	}

}
