package ex_25May2024_Exceptions;

public class Bank_ExampleExtention {

	public static void main(String[] args) throws Exception
	{
		Bank sbi = new Bank("INR",100);
		Bank jpmorgan = new Bank("USD",10);
		Integer total = sbi.add(jpmorgan);
		System.out.println(total);
	}
}
