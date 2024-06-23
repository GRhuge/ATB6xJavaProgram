package ex_16May2024MultiLevel.ApiAutomation;

public class Lab146 {

	public static void main(String[] args) {
		Test t = new Test();
		t.openExcelFile();
		t.openSQLConnection();
		int a = t.API_version;
	}

}
