package ex_25May2024_Exceptions;

public class Bank {
	private String currency;
	private Integer amount;
	
	Bank(String currency, Integer amount){
		this.currency=currency;
		this.amount=amount;
	}
	String getCurrency() {
		return currency;
	}
	void setCurrency(String currency) {
		this.currency=currency;
	}
	
	Integer add(Bank bankName) throws Exception {
		if(!bankName.currency.equalsIgnoreCase("INR")) {
			throw new Exception("currency do not match ");
		}
		Integer sum = this.amount + bankName.amount;
		return sum;
	}
}
