package com.project3.state;

public class Phone
{
	private PhoneState phoneState;

	public void setState(PhoneState phoneState)
	{
		this.phoneState=phoneState;
	}

	public void incommingCall()
	{
		phoneState.handleCall();
	}
}