package ex_18May2024_Encapsulation;

public class Account {
	private double balance;
	
	double getBalance() {
		return balance;
	}
	void setBalance(double amount) {
		this.balance = this.balance+amount;
	}
}
