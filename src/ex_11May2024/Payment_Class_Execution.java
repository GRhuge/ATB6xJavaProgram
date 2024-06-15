package ex_11May2024;

public class Payment_Class_Execution {

	public static void main(String[] args) {
		Payment paymentMode = new Payment();
		paymentMode.paymentInfo = "Online Payment";
		System.out.println("The payment mode is -> " + paymentMode.paymentInfo);
		
		Payment paymentType = new Payment();
		paymentType.paymentInfo = "Debit Card";
		System.out.println("The payment type is -> " + paymentType.paymentInfo);
		
		Payment paymentStatus = new Payment();
		paymentStatus.paymentInfo = "Paid";
		System.out.println("The payment status is -> " + paymentStatus.paymentInfo);
	}

}
