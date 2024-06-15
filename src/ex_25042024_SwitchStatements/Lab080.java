package ex_25042024_SwitchStatements;
import java.util.Scanner;
public class Lab080 {
    
	public static void main(String[] args) {
		// Switch statement	 for Web Automation
		// We will ask user which browser you want me to run the code
		// chrome --> start chrome , firefox --> start firefox , edge --> start edge
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the browser name where you want me to execute the code/program");
		String browsername = sc.nextLine();
		//browsername = browsername.toLowerCase();
		
		
		switch(browsername)
		{
		case "chrome":
			System.out.println("Start the chrome browser");
			// Further code to start the chrome
			// Webdriver driver = new Chrome();
            break;
		case "firefox":
			System.out.println("Start the firefox browser");
			// Further code to start the firefox
			// Webdriver driver = new firefox();
			break;
		case "edge":
			System.out.println("Start the edge browser");
			// Further code to start the edge
			// Webdriver driver = new edge();
			break;
			default:
				System.out.println("I have no idea which browser is this");
		}
		
	}
}
