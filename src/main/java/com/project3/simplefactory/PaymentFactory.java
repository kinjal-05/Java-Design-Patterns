package com.project3.simplefactory;

public class PaymentFactory
{
	public static Payment getPayment(String type)
	{
		if(type==null) throw  new IllegalArgumentException("Payment Type Can not be NULL");

		return switch (type.toUpperCase())
		{
			case "CREDIT"->new CreditCardPayment();
			case "UPI"->new UPIPayment();
			case "PAYPAL"->new PaypalPayment();
			default -> throw new IllegalArgumentException("Unsupported Type");
		};
	}
}