package com.project3.state;

public class SilentState implements PhoneState
{
	@Override
	public void handleCall()
	{
		System.out.println("Phone is Silent");
	}
}