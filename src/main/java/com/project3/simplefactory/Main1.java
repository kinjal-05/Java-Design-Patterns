package com.project3.simplefactory;

public class Main1
{
	public static void main(String[] args)
	{
		Payment payment1=PaymentFactory.getPayment("UPI");
		Payment payment2=PaymentFactory.getPayment("CREDIT");
		Payment payment3=PaymentFactory.getPayment("PAYPAL");

		payment1.pay(100);
		payment2.pay(200);
		payment3.pay(300);
	}
}