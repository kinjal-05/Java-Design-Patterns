package com.project3.adapter;

public class Main1
{
	public static void main(String[] args)
	{
		OldPaymentGateway oldPaymentGateway=new OldPaymentGateway();

		PaymentAdapter paymentAdapter=new PaymentAdapter(oldPaymentGateway);

		paymentAdapter.pay(2500.00);
	}
}