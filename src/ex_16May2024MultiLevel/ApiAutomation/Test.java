package ex_16May2024MultiLevel.ApiAutomation;

public class Test extends BaseTest{
	void accessExcelandSQL(){
		openExcelFile();
		openSQLConnection();
		System.out.println(API_version);
	}
}
