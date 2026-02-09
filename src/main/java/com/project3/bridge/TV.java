package com.project3.bridge;

public class TV implements Device
{
	@Override
	public void turnOn()
	{
		System.out.println("TV is On");
	}

	@Override
	public void turnOff()
	{
		System.out.println("TV is Off");
	}

	@Override
	public void setVolume(int percent)
	{
		System.out.println("TV volume is set to "+percent);
	}
}