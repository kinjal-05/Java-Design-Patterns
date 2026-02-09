package com.project3.simplefactory;

public class CreditCardPayment implements Payment
{
	@Override
	public void pay(double amount)
	{
		System.out.println("Paid "+amount+" Using Credit Card");
	}
}