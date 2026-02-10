package com.project3.state;

public class VibrateState implements PhoneState
{
	@Override
	public void handleCall()
	{
		System.out.println("Phone is Vibrate");
	}
}