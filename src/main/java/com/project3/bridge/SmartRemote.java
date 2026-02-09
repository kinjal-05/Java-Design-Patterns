package com.project3.bridge;

public class SmartRemote extends RemoteControl
{
	public SmartRemote(Device device)
	{
		super(device);
	}

	@Override
	public void volumeUp()
	{
		device.setVolume(80);
	}
}