package encapsulation2;

public class vwoLogin {
	private String username;
	private String password;
	
	vwoLogin(String username, String password){
		this.username = username;
		this.password = password;
	}
	String getUsername() {
		return username;
	}
	void setUsername(String username) {
		this.username = username;
	}
	String getPassword(boolean isAuth){
		if(isAuth) {
		return password;
	}
		else {
			return "Not Allowed";
		}
		}
	void setPassword(String password, boolean isAuth) {
		if(isAuth) {
		this.password = password;
		}
		else {
			System.out.println("Not Allowed");
		}
	}
}
class login{
	public static void main(String[] args) {
		vwoLogin l = new vwoLogin("admin", "admin123");
	//	l.username = "prj";
		String username = l.getUsername();
	//	String password = l.getPassword(true);
		l.setPassword("prj",false);
	//	System.out.println(password);
	}
}
