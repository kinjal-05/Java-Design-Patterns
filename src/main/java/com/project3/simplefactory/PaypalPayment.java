package com.project3.simplefactory;

public class PaypalPayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid "+amount+" Using Paypal");
	}
}