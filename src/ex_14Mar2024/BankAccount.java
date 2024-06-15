package ex_14Mar2024;

public class BankAccount {
	
	String bankName;
	int balance;
	String bankCode;
	BankAccount(){
		bankName = "SBI";
		balance = 500;
		bankCode = "SBI001";
	}
	BankAccount(String bankName, int balance, String bankCode){
		this.bankName = bankName;
		this.balance = balance;
		this.bankCode = bankCode;
	}
	BankAccount(String bankName, String bankCode){
		this.bankName = bankName;
		this.bankCode = bankCode;
	}
	void printDetails() {
		System.out.println("Bank Name -> " + bankName);
		System.out.println("Balance -> " + balance);
		System.out.println("bankCode -> " + bankCode);
	}
	public static void main(String[] args){
		BankAccount sbi = new BankAccount();
		sbi.printDetails();
		
		BankAccount hdfc = new BankAccount("HDFC", 20, "HDFC001");
		hdfc.printDetails();
		
		BankAccount icici = new BankAccount("Icici", 22, "ICICI002");
		icici.printDetails();
		
		BankAccount yesbank = new BankAccount("Yesbank", "YES003");
		yesbank.printDetails();
	}
}
