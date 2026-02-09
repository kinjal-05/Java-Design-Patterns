package com.project3.bridge;

public class BasicRemote extends RemoteControl
{
	public BasicRemote(Device device)
	{
		super(device);
	}

	@Override
	public void volumeUp()
	{
		device.setVolume(50);
	}
}