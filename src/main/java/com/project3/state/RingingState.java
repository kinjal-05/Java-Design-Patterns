package com.project3.state;

public class RingingState implements PhoneState
{
	@Override
	public void handleCall()
	{
		System.out.println("Phone is Ringing");
	}
}