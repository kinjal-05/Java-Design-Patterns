package com.project3.bridge;

public class AirConditioner implements Device
{
	@Override
	public void turnOn()
	{
		System.out.println("AC is On");
	}

	@Override
	public void turnOff()
	{
		System.out.println("AC is Off");
	}

	@Override
	public void setVolume(int percent)
	{
		System.out.println("AC volume is set to "+percent);
	}
}