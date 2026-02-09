package com.project3.adapter;

public class PaymentAdapter implements PaymentProcessor
{
	private OldPaymentGateway oldPaymentGateway;

	public PaymentAdapter(OldPaymentGateway oldPaymentGateway)
	{
		this.oldPaymentGateway=oldPaymentGateway;
	}

	@Override
	public void pay(double amount)
	{
		oldPaymentGateway.makePaymentInRupees(amount);
	}
}