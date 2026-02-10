package com.project3.state;


public class Main1
{
	public static void main(String[] args)
	{
		Phone phone=new Phone();

		phone.setState(new RingingState());
		phone.incommingCall();

		phone.setState(new SilentState());
		phone.incommingCall();

		phone.setState(new VibrateState());
		phone.incommingCall();
	}
}