package com.project3.strategy;

public class Main1
{
	public static void main(String[] args)
	{
		PaymentContext paymentContext=new PaymentContext();

		paymentContext.setPaymentStrategy(new CreditCardPayment());
		paymentContext.makePayment(1000);

		paymentContext.setPaymentStrategy(new UPIPayment());
		paymentContext.makePayment(2000);
	}
}