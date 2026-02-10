package com.project3.strategy;

public class UPIPayment implements PaymentStrategy
{
	@Override
	public void pay(int amount)
	{
		System.out.println("Paid "+amount+" Using UPI");
	}
}