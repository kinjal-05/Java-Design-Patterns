package com.project3.bridge;

public abstract class RemoteControl
{
	protected Device device;

	public RemoteControl(Device device)
	{
		this.device=device;
	}


	public void powerOn()
	{
		device.turnOn();
	}
	public void powerOff()
	{
		device.turnOff();
	}

	public abstract void volumeUp();
}